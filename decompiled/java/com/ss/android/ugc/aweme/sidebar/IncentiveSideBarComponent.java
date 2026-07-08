package com.ss.android.ugc.aweme.sidebar;

import X.C01U6;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1580320rE6;
import X.C1580820rEu;
import X.C1582460rHY;
import X.C1723230uwb;
import X.C1893670zNV;
import X.C1893780zNg;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1580560rEU;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AComparatorS43S0000000_24;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.touchpoint.api.config.IIncentiveManager;
import com.bytedance.touchpoint.api.model.AssetDetail;
import com.bytedance.touchpoint.api.model.GameplayCard;
import com.bytedance.touchpoint.api.model.IncentiveSideBar;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent;
import com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponentUiData;
import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentProtocol;
import com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class IncentiveSideBarComponent extends SideBarSectionComponent implements ISideBarComponentProtocol {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public LinearLayout LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public SideBarSectionComponentConfig LLJL;
    public final AwS568S0100000_24 LLJLIL = new AwS568S0100000_24(this, 1121);

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentProtocol
    public final String AP0() {
        return "sidebar_rewards_section";
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentProtocol
    public final C19719912Dl LW0() {
        return C13LE.LIZ(IncentiveSideBarComponent.class);
    }

    public static List Ep(IncentiveSideBar incentiveSideBar) {
        ArrayList arrayList = new ArrayList();
        if (incentiveSideBar.assetDetail != null) {
            arrayList.add("balance_status");
        }
        List<GameplayCard> list = incentiveSideBar.gameplayCardList;
        if (list != null) {
            for (GameplayCard gameplayCard : list) {
                arrayList.add(String.valueOf(gameplayCard.taskKey));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(gameplayCard.taskKey);
                sbLIZ.append("_button");
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent
    /* JADX INFO: renamed from: Bp */
    public final void tp(View view, SideBarSectionComponentConfig sideBarSectionComponentConfig) {
        String str;
        C20600815jK<InterfaceC1891350zJl> state;
        Context context;
        int iIntValue;
        int iIntValue2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        n nVar;
        SideBarSectionComponentUiData sideBarSectionComponentUiData;
        super.tp(view, sideBarSectionComponentConfig);
        this.LLJL = sideBarSectionComponentConfig;
        if (sideBarSectionComponentConfig == null || (nVar = sideBarSectionComponentConfig.sectionUiData) == null || (sideBarSectionComponentUiData = (SideBarSectionComponentUiData) C1580820rEu.LIZ(nVar.toString(), SideBarSectionComponentUiData.class)) == null || (str = sideBarSectionComponentUiData.customDataRaw) == null) {
            str = "{}";
        }
        C1893670zNV c1893670zNVLJIIJ = C1893780zNg.LIZIZ.LJIIJ(str);
        if (c1893670zNVLJIIJ instanceof IncentiveSideBar) {
            IncentiveSideBar incentiveSideBar = (IncentiveSideBar) c1893670zNVLJIIJ;
            ((ArrayList) this.LLJJIJIL).addAll(Ep(incentiveSideBar));
            if (this.LLJJLIIIJLLLLLLLZ == null) {
                AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(this, c1893670zNVLJIIJ, 39);
                C01U6.LIZIZ(new AwS425S0200000_24(this, c1893670zNVLJIIJ, 38));
                View view2 = this.LLJJLIIIJLLLLLLLZ;
                if (view2 != null) {
                    C2211631BhB.LJ(view2, new AwS390S0200000_24(sideBarSectionComponentConfig, awS425S0200000_24, 37));
                }
            }
            View view3 = this.LLJJLIIIJLLLLLLLZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            IIncentiveManager iIncentiveManager = (IIncentiveManager) PluggableExtentionKt.pluggableSpi$default(IIncentiveManager.class, false, false, false, 14, null);
            if (iIncentiveManager != null) {
                iIncentiveManager.LIZLLL();
            }
            AssetDetail assetDetail = incentiveSideBar.assetDetail;
            if (assetDetail != null) {
                LinearLayout linearLayout = this.LLJJL;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(0, linearLayout);
                }
                LinearLayout linearLayout2 = this.LLJJL;
                if (linearLayout2 != null && (context = linearLayout2.getContext()) != null) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
                    if (numLIZJ2 != null) {
                        iIntValue2 = numLIZJ2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    String str2 = assetDetail.pointBalance;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    SpannableString spannableStringLIZ = C1723230uwb.LIZ(context, str2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), null, 13, Integer.valueOf(iIntValue));
                    String str4 = assetDetail.cashBalance;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    SpannableString spannableStringLIZ2 = C1723230uwb.LIZ(context, str3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), null, 103, Integer.valueOf(iIntValue2));
                    if (assetDetail.layoutType == 1) {
                        LinearLayout linearLayout3 = this.LLJJL;
                        if (linearLayout3 != null) {
                            linearLayout3.setOrientation(1);
                        }
                        TuxTextView tuxTextView = this.LLJJJJLIIL;
                        if (tuxTextView != null) {
                            layoutParams2 = tuxTextView.getLayoutParams();
                        } else {
                            layoutParams2 = null;
                        }
                        boolean z = layoutParams2 instanceof LinearLayout.LayoutParams;
                        if (z) {
                            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                            if (layoutParams3 != null) {
                                layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                            }
                            if (z && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                            }
                        }
                    } else {
                        LinearLayout linearLayout4 = this.LLJJL;
                        if (linearLayout4 != null) {
                            linearLayout4.setOrientation(0);
                        }
                        TuxTextView tuxTextView2 = this.LLJJJJLIIL;
                        if (tuxTextView2 != null) {
                            layoutParams = tuxTextView2.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        boolean z2 = layoutParams instanceof LinearLayout.LayoutParams;
                        if (z2) {
                            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams;
                            if (layoutParams4 != null) {
                                layoutParams4.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                            }
                            if (z2 && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                            }
                        }
                    }
                    TuxTextView tuxTextView3 = this.LLJJJJJIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(spannableStringLIZ);
                    }
                    TuxTextView tuxTextView4 = this.LLJJJJLIIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(spannableStringLIZ2);
                    }
                    TuxTextView tuxTextView5 = this.LLJJJJLIIL;
                    if (tuxTextView5 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView5, 0);
                    }
                }
            } else {
                LinearLayout linearLayout5 = this.LLJJL;
                if (linearLayout5 != null) {
                    C786410Ut5.LJZL(8, linearLayout5);
                }
            }
            List<GameplayCard> list = incentiveSideBar.gameplayCardList;
            if (list != null) {
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS43S0000000_24(12), list);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                Iterator it2 = listLJLLLL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C1582460rHY((GameplayCard) it2.next(), kp()));
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJJ;
                if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                    state.LJIILL(arrayList, null);
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJJ;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                    C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv2);
                }
            } else {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJJJ;
                if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                    C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv3);
                }
            }
        } else {
            View view4 = this.LLJJLIIIJLLLLLLLZ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
        }
        Set<Function0<Unit>> set = C1580320rE6.LIZ;
        C1580320rE6.LIZ(this.LLJLIL);
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarSectionComponent, com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final /* bridge */ /* synthetic */ void tp(View view, InterfaceC1580560rEU interfaceC1580560rEU) {
        tp(view, (SideBarSectionComponentConfig) interfaceC1580560rEU);
    }
}
