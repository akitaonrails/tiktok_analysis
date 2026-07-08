package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center;

import X.C019F;
import X.C09R3;
import X.C0Q4Y;
import X.C1146120fvm;
import X.C1146150fvp;
import X.C1146240fvy;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C16FS;
import X.C16FZ;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C520010KaN;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS152S0100000_17;
import Y.AsS44S0100000_17;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.GiftAnchorPanelCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordDiamondCell;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordEmptyCell;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordGiftCell;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordHeaderCell;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordLoadingCell;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordNoMoreCell;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordTipCell;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelRecordPageCenterAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1146120fvm.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public C16FZ LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public AnimatorSet LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftAnchorPanelRecordPageCenterAssem.class, "panelCenterVM", "getPanelCenterVM()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/GiftAnchorPanelCenterViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GiftAnchorPanelRecordPageCenterAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/record/center/GiftAnchorPanelRecordPageCenterAssemViewModel;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public GiftAnchorPanelRecordPageCenterAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelCenterViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS561S0100000_17(c19719912DlLIZ, 158), AFwS254S0000000_17.get$arr$(57), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GiftAnchorPanelRecordPageCenterAssemViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS561S0100000_17(c19719912DlLIZ2, 159), AFwS254S0000000_17.get$arr$(58), null, true);
        this.LLJJJJ = true;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gxb;
    }

    public final C1146120fvm hp() {
        return (C1146120fvm) this.LLJJI.getValue();
    }

    public final GiftAnchorPanelRecordPageCenterAssemViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (GiftAnchorPanelRecordPageCenterAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        GiftMessage giftMessage;
        C16FS c16fs;
        C16FS c16fs2;
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (C16FZ) view.findViewById(R.id.nnp);
        this.LLJJIJIL = (LinearLayout) view.findViewById(R.id.hbn);
        this.LLJJJ = (LinearLayout) view.findViewById(R.id.h3n);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.sze);
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setEdgeEffectFactory(new C1146240fvy());
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.LLJJJIL = viewOnAttachStateChangeListenerC20604515jv;
        C1146150fvp c1146150fvp = hp().LLILZ;
        if (c1146150fvp != null) {
            giftMessage = c1146150fvp.LIZIZ;
        } else {
            giftMessage = null;
        }
        if (giftMessage == null) {
            this.LLJJJJ = false;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv2.setHasFixedSize(true);
            viewOnAttachStateChangeListenerC20604515jv2.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv2.setClipChildren(true);
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(view.getContext()));
            IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
            if (iHostCreativeTool != null && iHostCreativeTool.UC0()) {
                viewOnAttachStateChangeListenerC20604515jv2.setLifecycleOwner(this);
            }
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(AnchorRecordGiftCell.class, AnchorRecordDiamondCell.class, AnchorRecordEmptyCell.class, AnchorRecordHeaderCell.class, AnchorRecordTipCell.class, AnchorRecordLoadingCell.class, AnchorRecordNoMoreCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.addOnScrollListener(new AsS44S0100000_17(this, 3));
        }
        LinearLayout linearLayout = this.LLJJIJIL;
        if (linearLayout != null && (c16fs2 = (C16FS) linearLayout.findViewById(R.id.hbo)) != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS152S0100000_17(this, 34));
        }
        LinearLayout linearLayout2 = this.LLJJJ;
        if (linearLayout2 != null && (c16fs = (C16FS) linearLayout2.findViewById(R.id.h3t)) != null) {
            C786410Ut5.h8(c16fs, new ACListenerS152S0100000_17(this, 35));
        }
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0fve
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1145980fvY) obj).LL;
            }
        }, this, null, new AwS596S0100000_17(this, 137), new AwS561S0100000_17(this, 157), new AwS596S0100000_17(this, 138), 4, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0fvd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1145980fvY) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS631S0100000_17(this, 11), 4);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0fvn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1146210fvv) obj).LLILLJJLI;
            }
        }, null, new AwS631S0100000_17(this, 12), 6);
    }
}
