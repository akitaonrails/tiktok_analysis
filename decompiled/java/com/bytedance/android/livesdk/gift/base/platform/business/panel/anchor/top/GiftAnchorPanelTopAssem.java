package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.top;

import X.C03IJ;
import X.C0UX6;
import X.C1146120fvm;
import X.C11S5;
import X.C12ES;
import X.C1324720kZq;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C480460Ism;
import X.C498240JgM;
import X.C498250JgN;
import X.C500260Jjc;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC496820Je4;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS46S0400000_7;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.livesetting.reddot.RedDotAssetsSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import tikcast.api.privilege.QueryUserPrivilegesResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class GiftAnchorPanelTopAssem extends UISlotAssem implements IGiftAnchorPanelTopAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1146120fvm.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public View LLJJIJI;
    public C1324720kZq LLJJIJIIJIL;
    public C1324720kZq LLJJIJIL;
    public View LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftAnchorPanelTopAssem.class, "topVM", "getTopVM()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/top/GiftAnchorPanelTopViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GiftAnchorPanelTopAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelTopViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 64), AFwS237S0000000_7.get$arr$(33), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gxe;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1741740846) {
            return null;
        }
        return this;
    }

    public final C1146120fvm hp() {
        return (C1146120fvm) this.LLJJI.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.top.IGiftAnchorPanelTopAbility
    public final int p31() {
        return LJJIJL().getHeight();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Room room;
        Long lValueOf;
        View view2;
        Room room2;
        Room room3;
        super.onViewCreated(view);
        this.LLJJIJI = view.findViewById(R.id.rvn);
        this.LLJJIJIIJIL = (C1324720kZq) view.findViewById(R.id.lrx);
        this.LLJJIJIL = (C1324720kZq) view.findViewById(R.id.lry);
        this.LLJJJ = view.findViewById(R.id.rvz);
        PrivilegeCenterConfig privilegeCenterConfigLJI = C498240JgM.LJI();
        C1146120fvm c1146120fvmHp = hp();
        Long lValueOf2 = null;
        if (c1146120fvmHp != null) {
            room = c1146120fvmHp.LL;
        } else {
            room = null;
        }
        ip(privilegeCenterConfigLJI, room, view.getContext(), false);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        AssemViewModel value = assemVMLazy.getValue();
        C1146120fvm c1146120fvmHp2 = hp();
        if (c1146120fvmHp2 != null && (room3 = c1146120fvmHp2.LL) != null) {
            lValueOf = Long.valueOf(room3.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        C1146120fvm c1146120fvmHp3 = hp();
        if (c1146120fvmHp3 != null && (room2 = c1146120fvmHp3.LL) != null) {
            lValueOf2 = Long.valueOf(room2.getOwnerUserId());
        }
        String strValueOf2 = String.valueOf(lValueOf2);
        C480460Ism.LIZ().getClass();
        value.execute(((PrivilegeApi) C480460Ism.LIZLLL(PrivilegeApi.class)).getPrivilegeCenterEntranceInfo(strValueOf, strValueOf2, EnumC496820Je4.REQUEST_FROM_SCENE_GIFT_PANEL.getType()).LJL(C11S5.LIZ()), AFwS290S0000000_7.get$arr$(27));
        AssemViewModel.asyncSubscribe$default(this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0JgO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C497020JeO) obj).LL;
            }
        }, null, new AwS373S0200000_7(this, view, 5), null, new AwS373S0200000_7(this, view, 6), 10, null);
        if (RedDotAssetsSetting.INSTANCE.enableAssetsRedDot() && (view2 = this.LLJJJ) != null) {
            RedDotExtensionKt.LJIIJ(C0UX6.RED_DOT_LIVE_PRIVILEGE_CENTER, view2, this, null, "watch_gift", 4);
        }
    }

    public final void ip(PrivilegeCenterConfig privilegeCenterConfig, Room room, Context context, boolean z) {
        DataChannel dataChannel;
        String uri;
        FrameLayout.LayoutParams layoutParams;
        DataChannel dataChannel2;
        boolean z2;
        if (privilegeCenterConfig.showEntrance) {
            C500260Jjc.LLFFF(this.LLJJIJI);
            C1324720kZq c1324720kZq = this.LLJJIJIIJIL;
            C1324720kZq c1324720kZq2 = this.LLJJIJIL;
            View view = this.LLJJJ;
            C1146120fvm c1146120fvmHp = hp();
            ViewGroup.LayoutParams layoutParams2 = null;
            if (c1146120fvmHp != null) {
                dataChannel = c1146120fvmHp.LLILLJJLI;
            } else {
                dataChannel = null;
            }
            C498240JgM.LIZ(new C498250JgN(null, c1324720kZq, c1324720kZq2, view, privilegeCenterConfig, dataChannel, C0UX6.RED_DOT_LIVE_PRIVILEGE_CENTER, R.drawable.dl8, R.drawable.dl8, z));
            if (z) {
                C1146120fvm c1146120fvmHp2 = hp();
                if (c1146120fvmHp2 != null) {
                    dataChannel2 = c1146120fvmHp2.LLILLJJLI;
                } else {
                    dataChannel2 = null;
                }
                View view2 = this.LLJJJ;
                if (view2 != null && C500260Jjc.LJJJJIZL(view2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C498240JgM.LJFF("show", "gift_panel", dataChannel2, room, z2);
            }
            QueryUserPrivilegesResponse.EntranceConfig entranceConfig = privilegeCenterConfig.entranceConfig;
            if (entranceConfig != null && entranceConfig.showRedDot) {
                ImageModel imageModel = entranceConfig.background;
                if (imageModel != null) {
                    uri = imageModel.getUri();
                } else {
                    uri = null;
                }
                if (!TextUtils.isEmpty(uri)) {
                    View view3 = this.LLJJJ;
                    if (view3 != null) {
                        layoutParams2 = view3.getLayoutParams();
                    }
                    if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                        int iLIZJ = (int) C12ES.LIZJ(3.0f, getContext());
                        layoutParams.topMargin = iLIZJ;
                        layoutParams.setMarginEnd(iLIZJ);
                        View view4 = this.LLJJJ;
                        if (view4 != null) {
                            C786410Ut5.W5(view4, layoutParams);
                        }
                    }
                }
            }
            View view5 = this.LLJJIJI;
            if (view5 != null) {
                C786410Ut5.I7(new ACListenerS46S0400000_7(this, room, context, privilegeCenterConfig, 0), view5);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLJJIJI);
    }
}
