package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center;

import X.C019F;
import X.C0IJT;
import X.C1133630fbd;
import X.C1133640fbe;
import X.C1146120fvm;
import X.C1146150fvp;
import X.C1146190fvt;
import X.C1203130hPj;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C474500IjA;
import X.C497740JfY;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC1146170fvr;
import X.EnumC1166860gTE;
import X.InterfaceC1203170hPn;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.GiftAnchorPanelCenterViewModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelPulldownSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS125S0101000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelCenterAssem extends UISlotAssem implements IGiftAnchorPanelCenterAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1146120fvm.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public C1203130hPj LLJJIJI;
    public boolean LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftAnchorPanelCenterAssem.class, "centerVM", "getCenterVM()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/GiftAnchorPanelCenterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GiftAnchorPanelCenterAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelCenterViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS561S0100000_17(c19719912DlLIZ, 145), AFwS254S0000000_17.get$arr$(50), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gx7;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1693532332) {
            return null;
        }
        return this;
    }

    public final GiftAnchorPanelCenterViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (GiftAnchorPanelCenterViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1133630fbd c1133630fbd = ((C1146120fvm) this.LLJJI.getValue()).LLILZIL;
        String str = ((C1146120fvm) this.LLJJI.getValue()).LLILLL;
        String str2 = hp().getState().LLILLJJLI.getFirst() == EnumC1146170fvr.GIFT ? "gifts" : "gift_record";
        if (c1133630fbd.LJIIIIZZ > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - c1133630fbd.LJIIIIZZ;
            int i = c1133630fbd.LIZJ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_panel_dismiss");
            C1133640fbe.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII(str, "gift_enter_from");
            c474500IjALIZ.LJJII(str2, "exit_tab");
            c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis), "panel_stay_time");
            c474500IjALIZ.LJJII(i == 3 ? "tux_dropdown" : "default", "close_type");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.IGiftAnchorPanelCenterAbility
    public final int tz0() {
        return LJJIJL().getHeight();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        getContentView().getLayoutParams().height = ((int) (((double) C497740JfY.LJIILL()) * 0.73d)) - C497740JfY.LJIIIZ(R.dimen.aot);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1203130hPj c1203130hPj;
        RecyclerView recyclerView;
        super.onViewCreated(view);
        this.LLJJIJI = (C1203130hPj) view.findViewById(R.id.dry);
        int i = 0;
        if (LiveGiftPanelPulldownSetting.INSTANCE.isEnabled() && (c1203130hPj = this.LLJJIJI) != null && (recyclerView = c1203130hPj.getRecyclerView()) != null) {
            recyclerView.setNestedScrollingEnabled(false);
        }
        C1203130hPj c1203130hPj2 = this.LLJJIJI;
        if (c1203130hPj2 != null) {
            c1203130hPj2.setVariant(EnumC1166860gTE.CAPSULE);
        }
        C1203130hPj c1203130hPj3 = this.LLJJIJI;
        if (c1203130hPj3 != null) {
            c1203130hPj3.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.0fvu
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i2, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                    EnumC1146170fvr enumC1146170fvr;
                    String str;
                    if (z) {
                        GiftAnchorPanelCenterViewModel giftAnchorPanelCenterViewModelHp = this.LIZ.hp();
                        if (i2 != giftAnchorPanelCenterViewModelHp.getState().LLILLJJLI.getSecond().intValue() && (enumC1146170fvr = (EnumC1146170fvr) C13LP.LJJJLZIJ(i2, giftAnchorPanelCenterViewModelHp.getState().LL.getFirst())) != null) {
                            String str2 = ((C1146120fvm) giftAnchorPanelCenterViewModelHp.LL.getValue()).LLILLL;
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_panel_tab_click");
                            C1133640fbe.LIZ(c474500IjALIZ);
                            c474500IjALIZ.LJJII(str2, "gift_enter_from");
                            if (enumC1146170fvr == EnumC1146170fvr.RECORD) {
                                str = "gift_record";
                            } else {
                                str = "gifts";
                            }
                            c474500IjALIZ.LJJII(str, "tab_name");
                            c474500IjALIZ.LIZ();
                            giftAnchorPanelCenterViewModelHp.setState(new AwS125S0101000_17(enumC1146170fvr, i2, 7));
                        }
                    }
                }
            });
        }
        C723850SaN.LIZLLL(this, new AwS596S0100000_17(this, 127));
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0fvx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1146210fvv) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS631S0100000_17(this, 7), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0fvw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1146210fvv) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS631S0100000_17(this, 8), 4);
        GiftAnchorPanelCenterViewModel giftAnchorPanelCenterViewModelHp = hp();
        List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC1146170fvr.GIFT, EnumC1146170fvr.RECORD);
        C1146150fvp c1146150fvp = ((C1146120fvm) giftAnchorPanelCenterViewModelHp.LL.getValue()).LLILZ;
        if ((c1146150fvp != null && c1146150fvp.LIZIZ != null) || Intrinsics.LJFF(((C1146120fvm) giftAnchorPanelCenterViewModelHp.LL.getValue()).LLILLL, "interaction_msg")) {
            i = 1;
        }
        EnumC1146170fvr enumC1146170fvr = (EnumC1146170fvr) C13LP.LJJJLZIJ(i, listLJIIJJI);
        if (enumC1146170fvr == null) {
            enumC1146170fvr = EnumC1146170fvr.NONE;
        }
        giftAnchorPanelCenterViewModelHp.setState(new C1146190fvt(listLJIIJJI, i, enumC1146170fvr));
    }
}
