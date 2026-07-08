package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary;

import X.AbstractC1812500xGa;
import X.AbstractC1812820xH6;
import X.C0HTI;
import X.C1161920gLG;
import X.C1390410mHn;
import X.C13LE;
import X.C16F5;
import X.C1812520xGc;
import X.C1812600xGk;
import X.C1812660xGq;
import X.C1812670xGr;
import X.C1812880xHC;
import X.C1812990xHN;
import X.C1813080xHW;
import X.C1813280xHq;
import X.C1954807lC;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C475510Ikn;
import X.C497700JfU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1812620xGm;
import X.InterfaceC1180504jb;
import X.InterfaceC1813000xHO;
import X.InterfaceC1813270xHp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC775640Ubi;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAISummaryBoardSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class AiSummaryTextStylePanelDialog extends LiveSheetFragment implements InterfaceC1813270xHp<C1812670xGr, AbstractC1812500xGa, AbstractC1812820xH6, AiSummaryViewModel>, InterfaceC1813000xHO {
    public static final C1812990xHN LLLII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE0OiHELIOSo7PSd9LCAvJj0yPCwjJ2EyITY5JCIyOjxiCCYAPSghKD0qHCA0PRwnMSkpGS49LSkIIC4/JyI=";
    public LiveIconView LLJLLL;
    public ViewGroup LLJZ;
    public C1390410mHn LLJZIJLIL;
    public LiveIconView LLL;
    public C16F5 LLLF;
    public C16F5 LLLFF;
    public View LLLFFI;
    public int LLLFZ;
    public volatile AiSummaryTextStylePanelView LLLI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xHN] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AiSummaryTextStylePanelDialog.class, "panelView", "getPanelView()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/aisummary/AiSummaryTextStylePanelView;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLII = new Object() { // from class: X.0xHN
        };
    }

    @Override // X.InterfaceC1813000xHO
    public final String getEntrance() {
        return null;
    }

    public final AiSummaryTextStylePanelView uS() {
        AiSummaryTextStylePanelView aiSummaryTextStylePanelView = this.LLLI;
        if (aiSummaryTextStylePanelView == null) {
            synchronized (this) {
                aiSummaryTextStylePanelView = this.LLLI;
                if (aiSummaryTextStylePanelView == null) {
                    AiSummaryTextStylePanelView aiSummaryTextStylePanelView2 = new AiSummaryTextStylePanelView();
                    this.LLLI = aiSummaryTextStylePanelView2;
                    return aiSummaryTextStylePanelView2;
                }
            }
        }
        return aiSummaryTextStylePanelView;
    }

    public final AiSummaryViewModel wS() {
        return (AiSummaryViewModel) ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createViewModel(AiSummaryViewModel.class);
    }

    @Override // X.InterfaceC1813270xHp
    public final void Xh(InterfaceC775640Ubi interfaceC775640Ubi) {
        C1812670xGr c1812670xGr = (C1812670xGr) interfaceC775640Ubi;
        int i = C1812660xGq.LIZ[c1812670xGr.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        View view = this.LLLFFI;
                        if (view != null) {
                            C500260Jjc.LJIILIIL(view);
                        }
                        ViewGroup viewGroup = this.LLJZ;
                        if (viewGroup != null) {
                            C500260Jjc.LLFFF(viewGroup);
                        }
                        C1390410mHn c1390410mHn = this.LLJZIJLIL;
                        if (c1390410mHn != null) {
                            C500260Jjc.LJIILIIL(c1390410mHn);
                        }
                        C1390410mHn c1390410mHn2 = this.LLJZIJLIL;
                        if (c1390410mHn2 != null) {
                            c1390410mHn2.LIZLLL();
                        }
                        LiveIconView liveIconView = this.LLL;
                        if (liveIconView != null) {
                            C500260Jjc.LJIILIIL(liveIconView);
                        }
                        C16F5 c16f5 = this.LLLF;
                        if (c16f5 != null) {
                            C500260Jjc.LJIILIIL(c16f5);
                        }
                        C16F5 c16f52 = this.LLLFF;
                        if (c16f52 != null) {
                            C500260Jjc.LLFFF(c16f52);
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                View view2 = this.LLLFFI;
                if (view2 != null) {
                    C500260Jjc.LJIILIIL(view2);
                }
                ViewGroup viewGroup2 = this.LLJZ;
                if (viewGroup2 != null) {
                    C500260Jjc.LLFFF(viewGroup2);
                }
                C1390410mHn c1390410mHn3 = this.LLJZIJLIL;
                if (c1390410mHn3 != null) {
                    C500260Jjc.LLFFF(c1390410mHn3);
                }
                C1390410mHn c1390410mHn4 = this.LLJZIJLIL;
                if (c1390410mHn4 != null) {
                    c1390410mHn4.LIZJ();
                }
                LiveIconView liveIconView2 = this.LLL;
                if (liveIconView2 != null) {
                    C500260Jjc.LJIILIIL(liveIconView2);
                }
                C16F5 c16f53 = this.LLLF;
                if (c16f53 != null) {
                    C500260Jjc.LJIILIIL(c16f53);
                }
                C16F5 c16f54 = this.LLLFF;
                if (c16f54 == null) {
                    return;
                }
                C500260Jjc.LJIILIIL(c16f54);
                return;
            }
            View view3 = this.LLLFFI;
            if (view3 != null) {
                C500260Jjc.LJIILIIL(view3);
            }
            ViewGroup viewGroup3 = this.LLJZ;
            if (viewGroup3 != null) {
                C500260Jjc.LLFFF(viewGroup3);
            }
            C1390410mHn c1390410mHn5 = this.LLJZIJLIL;
            if (c1390410mHn5 != null) {
                C500260Jjc.LJIILIIL(c1390410mHn5);
            }
            C1390410mHn c1390410mHn6 = this.LLJZIJLIL;
            if (c1390410mHn6 != null) {
                c1390410mHn6.LIZLLL();
            }
            LiveIconView liveIconView3 = this.LLL;
            if (liveIconView3 != null) {
                C500260Jjc.LLFFF(liveIconView3);
            }
            C16F5 c16f55 = this.LLLF;
            if (c16f55 != null) {
                C500260Jjc.LLFFF(c16f55);
            }
            C16F5 c16f56 = this.LLLFF;
            if (c16f56 == null) {
                return;
            }
            C500260Jjc.LJIILIIL(c16f56);
            return;
        }
        ViewGroup viewGroup4 = this.LLJZ;
        if (viewGroup4 != null) {
            C500260Jjc.LJIILIIL(viewGroup4);
        }
        C1390410mHn c1390410mHn7 = this.LLJZIJLIL;
        if (c1390410mHn7 != null) {
            C500260Jjc.LJIILIIL(c1390410mHn7);
        }
        C1390410mHn c1390410mHn8 = this.LLJZIJLIL;
        if (c1390410mHn8 != null) {
            c1390410mHn8.LIZLLL();
        }
        View view4 = this.LLLFFI;
        if (view4 != null) {
            C500260Jjc.LLFFF(view4);
        }
        if (c1812670xGr.LIZ instanceof C1812600xGk) {
            uS().onBindItemView((C1812600xGk) c1812670xGr.LIZ);
            uS().onViewAttachedToWindow();
            return;
        }
        LiveAISummaryBoardSetting liveAISummaryBoardSetting = LiveAISummaryBoardSetting.INSTANCE;
        if (liveAISummaryBoardSetting.broadcastDialogStyle() != 1 && liveAISummaryBoardSetting.broadcastDialogStyle() != 2) {
            return;
        }
        uS().onBindItemView(new C1812600xGk(c1812670xGr.LIZ.LL, EnumC1812620xGm.SUCCESS));
        uS().onViewAttachedToWindow();
    }

    @Override // X.InterfaceC1813270xHp
    public final void gn(InterfaceC1180504jb interfaceC1180504jb) {
        DataChannel dataChannelLJ;
        Context context;
        AbstractC1812820xH6 abstractC1812820xH6 = (AbstractC1812820xH6) interfaceC1180504jb;
        if (abstractC1812820xH6.LIZ() && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (context = getContext()) != null) {
            C1812880xHC.LIZJ(abstractC1812820xH6, this, context, dataChannelLJ);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        C1813080xHW.LJ(null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final String strValueOf = String.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this)));
        this.LLJLLL = (LiveIconView) view.findViewById(R.id.e1y);
        this.LLJZ = (ViewGroup) view.findViewById(R.id.w28);
        this.LLJZIJLIL = (C1390410mHn) view.findViewById(R.id.nnp);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.h2p);
        if (liveIconView != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n4;
            liveIconView.setIcon(c0hti.LIZ(liveIconView.getContext()));
            liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.eok, liveIconView.getContext()));
        } else {
            liveIconView = null;
        }
        this.LLL = liveIconView;
        this.LLLF = (C16F5) view.findViewById(R.id.h3c);
        this.LLLFF = (C16F5) view.findViewById(R.id.hbm);
        final ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.dxr);
        if (constraintLayout != null) {
            HandlerHook.viewPost(constraintLayout, new Runnable() { // from class: X.0GtE
                public final void LIZ() {
                    if (constraintLayout.getParent() != null) {
                        int i = (int) (this.getResources().getDisplayMetrics().heightPixels * 0.6f);
                        int paddingTop = constraintLayout.getPaddingTop() + constraintLayout.getPaddingBottom();
                        LiveIconView liveIconView2 = this.LLJLLL;
                        int height = i - ((paddingTop + (liveIconView2 != null ? liveIconView2.getHeight() : 0)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        if (height > 0) {
                            C19MB c19mb = new C19MB();
                            ConstraintLayout constraintLayout2 = constraintLayout;
                            c19mb.LJII(constraintLayout2);
                            c19mb.LJIIL(R.id.wrv, height);
                            c19mb.LIZIZ(constraintLayout2);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AiSummaryTextStylePanelDialog@b37f.limitScrollViewMaxHeight$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AiSummaryTextStylePanelDialog@b37f.limitScrollViewMaxHeight$1");
                }
            });
        }
        LiveIconView liveIconView2 = this.LLJLLL;
        if (liveIconView2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey_);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
            liveIconView2.setBackground(c384050F3z.LIZ(view.getContext()));
            C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.0xHI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.close(1);
                }
            });
        }
        C16F5 c16f5 = this.LLLFF;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new View.OnClickListener() { // from class: X.0xHF
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.wS().vQ2(new C1812520xGc(C497700JfU.LIZ.LIZ(), this.LL.LLLFZ, strValueOf, "live_capsule", 2));
                }
            });
        }
        C1813280xHq.LIZ(this, wS(), this);
        wS().vQ2(new C1812520xGc(C497700JfU.LIZ.LIZ(), this.LLLFZ, strValueOf, "live_capsule", 2));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fy9, viewGroup, false);
        View viewFindViewById = viewTd.findViewById(R.id.evm);
        this.LLLFFI = viewFindViewById;
        if (viewFindViewById != null) {
            uS().L5(this.LLLFZ, viewFindViewById, false);
        }
        return viewTd;
    }
}
