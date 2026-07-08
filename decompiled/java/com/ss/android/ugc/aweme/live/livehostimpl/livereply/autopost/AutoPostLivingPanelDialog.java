package com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost;

import X.AbstractC1777330wLr;
import X.AbstractC1777760wMY;
import X.C01GW;
import X.C0JDJ;
import X.C1749280vcc;
import X.C1777240wLi;
import X.C1777370wLv;
import X.C1777750wMX;
import X.C1777770wMZ;
import X.C1782380wU0;
import X.C1813220xHk;
import X.C1813280xHq;
import X.C1813440xI6;
import X.C1813460xI8;
import X.C1813470xI9;
import X.C1813480xIA;
import X.C1826520xdC;
import X.C1835760xs6;
import X.C1864680yck;
import X.C19EH;
import X.C20441214yg;
import X.C21411818qq;
import X.C2187701Ajg;
import X.C292401Bi;
import X.C457201qE;
import X.C465220IMe;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC1119310fEX;
import X.InterfaceC1180504jb;
import X.InterfaceC1484830ok5;
import X.InterfaceC1813270xHp;
import X.InterfaceC775640Ubi;
import X.ViewTreeObserverOnGlobalLayoutListenerC521800KdG;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class AutoPostLivingPanelDialog extends LiveSheetFragment implements C0JDJ, InterfaceC1813270xHp<C1813440xI6, AbstractC1777330wLr, AbstractC1777760wMY, AutoPostLivingViewModel> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiHELIOSklPyohLTUgMGEyPTEjOSAgPGsNPDs8GCo/PQM6PiwiLh8yJiAgDSYyJCor";
    public ConstraintLayout LLJZ;
    public FrameLayout LLJZIJLIL;
    public C1749280vcc LLL;
    public C1826520xdC LLLF;
    public C21411818qq LLLFF;
    public ViewGroup LLLFFI;
    public DataChannel LLLFZ;
    public C1813220xHk LLLII;
    public final C01GW LLJLLL = C292401Bi.LIZ(new AwS571S0100000_27(this, 299));
    public String LLLI = "";
    public final C01GW LLLIIII = C292401Bi.LIZ(new AwS571S0100000_27(this, 296));
    public final C01GW LLLIIIIL = C292401Bi.LIZ(new AwS571S0100000_27(this, 298));
    public final C01GW LLLIIIL = C292401Bi.LIZ(new AwS571S0100000_27(this, 297));
    public final C1864680yck LLLIIL = new C1864680yck(this, 0);

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
    }

    public final AutoPostLivingViewModel uS() {
        return (AutoPostLivingViewModel) this.LLJLLL.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        uS().vQ2(new C1777240wLi(this.LLLI, false));
        C1835760xs6 c1835760xs6 = (C1835760xs6) this.LLLIIII.getValue();
        InterfaceC1484830ok5 interfaceC1484830ok5LIZ = c1835760xs6.LIZ();
        if (interfaceC1484830ok5LIZ != null) {
            interfaceC1484830ok5LIZ.stop();
        }
        InterfaceC1484830ok5 interfaceC1484830ok5LIZ2 = c1835760xs6.LIZ();
        if (interfaceC1484830ok5LIZ2 != null) {
            interfaceC1484830ok5LIZ2.release();
        }
        InterfaceC1484830ok5 interfaceC1484830ok5LIZ3 = c1835760xs6.LIZ();
        if (interfaceC1484830ok5LIZ3 != null) {
            interfaceC1484830ok5LIZ3.LJJIIZ(c1835760xs6.LJII);
        }
        c1835760xs6.LJII = null;
        c1835760xs6.LJFF = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1835760xs6 c1835760xs6 = (C1835760xs6) this.LLLIIII.getValue();
        if (!c1835760xs6.LJ || c1835760xs6.LIZJ) {
            return;
        }
        InterfaceC1484830ok5 interfaceC1484830ok5LIZ = c1835760xs6.LIZ();
        if (interfaceC1484830ok5LIZ != null) {
            interfaceC1484830ok5LIZ.pause();
        }
        c1835760xs6.LIZIZ = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1835760xs6 c1835760xs6 = (C1835760xs6) this.LLLIIII.getValue();
        if (c1835760xs6.LIZIZ && c1835760xs6.LJ) {
            InterfaceC1484830ok5 interfaceC1484830ok5LIZ = c1835760xs6.LIZ();
            if (interfaceC1484830ok5LIZ != null) {
                interfaceC1484830ok5LIZ.resume();
            }
            c1835760xs6.LIZIZ = false;
        }
    }

    @Override // X.InterfaceC1813270xHp
    public final void gn(InterfaceC1180504jb interfaceC1180504jb) {
        if (interfaceC1180504jb instanceof C1777770wMZ) {
            C766270U4b.LIZLLL(2131851308);
        } else {
            if (!(interfaceC1180504jb instanceof C1777750wMX)) {
                return;
            }
            C766270U4b.LIZLLL(2131854909);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.draggable = true;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String strLJJJJJL;
        String string3;
        super.onCreate(bundle);
        C20441214yg.LIZIZ("AutoPostLivingPanelDialog", "onCreate");
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        this.LLLFZ = dataChannelLJ;
        String str = "";
        if (dataChannelLJ == null || (string = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannelLJ)).toString()) == null) {
            string = "";
        }
        this.LLLI = string;
        DataChannel dataChannel = this.LLLFZ;
        if (dataChannel == null || (string2 = Long.valueOf(C500260Jjc.LIZIZ(dataChannel)).toString()) == null) {
            string2 = "";
        }
        DataChannel dataChannel2 = this.LLLFZ;
        if (dataChannel2 == null) {
            strLJJJJJL = "";
        } else {
            strLJJJJJL = C500260Jjc.LJJJJJL(dataChannel2);
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string3 = arguments.getString("source")) != null) {
            str = string3;
        }
        this.LLLII = new C1813220xHk(str, this.LLLI, string2, strLJJJJJL);
        ((BaseAutoPostLivingListFragment) this.LLLIIIL.getValue()).LLJI = this.LLLII;
        ((BaseAutoPostLivingListFragment) this.LLLIIIIL.getValue()).LLJI = this.LLLII;
        C1813280xHq.LIZ(this, uS(), this);
        uS().vQ2(new C1777240wLi(this.LLLI, true));
    }

    @Override // X.InterfaceC1813270xHp
    public final /* bridge */ /* synthetic */ void Xh(InterfaceC775640Ubi interfaceC775640Ubi) {
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ConstraintLayout constraintLayout;
        FrameLayout frameLayout;
        C1749280vcc c1749280vcc;
        C1826520xdC c1826520xdC;
        C21411818qq c21411818qq;
        ViewGroup viewGroup;
        ViewTreeObserver viewTreeObserver;
        C20441214yg.LIZIZ("AutoPostLivingPanelDialog", "onViewCreated");
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            constraintLayout = (ConstraintLayout) view2.findViewById(R.id.ex3);
        } else {
            constraintLayout = null;
        }
        this.LLJZ = constraintLayout;
        View view3 = getView();
        if (view3 != null) {
            frameLayout = (FrameLayout) view3.findViewById(R.id.msd);
        } else {
            frameLayout = null;
        }
        this.LLJZIJLIL = frameLayout;
        View view4 = getView();
        if (view4 != null) {
            c1749280vcc = (C1749280vcc) view4.findViewById(R.id.w28);
        } else {
            c1749280vcc = null;
        }
        this.LLL = c1749280vcc;
        View view5 = getView();
        if (view5 != null) {
            c1826520xdC = (C1826520xdC) view5.findViewById(R.id.bg7);
        } else {
            c1826520xdC = null;
        }
        this.LLLF = c1826520xdC;
        View view6 = getView();
        if (view6 != null) {
            view6.findViewById(R.id.bg4);
        }
        View view7 = getView();
        if (view7 != null) {
            c21411818qq = (C21411818qq) view7.findViewById(R.id.bg5);
        } else {
            c21411818qq = null;
        }
        this.LLLFF = c21411818qq;
        View view8 = getView();
        if (view8 != null) {
            viewGroup = (ViewGroup) view8.findViewById(R.id.bg6);
        } else {
            viewGroup = null;
        }
        this.LLLFFI = viewGroup;
        C21411818qq c21411818qq2 = this.LLLFF;
        if (c21411818qq2 != null) {
            c21411818qq2.setInterceptToggleListener(new AwS571S0100000_27(this, 301));
        }
        C21411818qq c21411818qq3 = this.LLLFF;
        if (c21411818qq3 != null) {
            C786410Ut5.C7(c21411818qq3, this.LLLIIL);
        }
        C1826520xdC c1826520xdC2 = this.LLLF;
        if (c1826520xdC2 != null) {
            c1826520xdC2.LIZ(new C1782380wU0(C497740JfY.LJIJI(2131851300), null, 30));
            c1826520xdC2.LIZ(new C1782380wU0(C497740JfY.LJIJI(2131851298), null, 30));
            c1826520xdC2.setOnSelectedChangeListener(new InterfaceC1119310fEX() { // from class: X.0JvO
                @Override // X.InterfaceC1119310fEX
                public final void LIZ(int i, boolean z) {
                    if (z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("initTab setSelectedAt ");
                        sbLIZ.append(i);
                        C20441214yg.LIZIZ("AutoPostLivingPanelDialog", C2188811AlT.LIZIZ(sbLIZ));
                        AutoPostLivingPanelDialog autoPostLivingPanelDialog = this.LIZ;
                        if (i != 0) {
                            if (i != 1) {
                                autoPostLivingPanelDialog.getClass();
                                return;
                            }
                            C19EH c19ehLJIIJ = autoPostLivingPanelDialog.getChildFragmentManager().LJIIJ();
                            c19ehLJIIJ.LJJIFFI((Fragment) autoPostLivingPanelDialog.LLLIIIL.getValue());
                            c19ehLJIIJ.LJIILL((Fragment) autoPostLivingPanelDialog.LLLIIIIL.getValue());
                            c19ehLJIIJ.LJIIJ();
                            return;
                        }
                        C19EH c19ehLJIIJ2 = autoPostLivingPanelDialog.getChildFragmentManager().LJIIJ();
                        c19ehLJIIJ2.LJJIFFI((Fragment) autoPostLivingPanelDialog.LLLIIIIL.getValue());
                        c19ehLJIIJ2.LJIILL((Fragment) autoPostLivingPanelDialog.LLLIIIL.getValue());
                        c19ehLJIIJ2.LJIIJ();
                    }
                }
            });
        }
        C1826520xdC c1826520xdC3 = this.LLLF;
        if (c1826520xdC3 != null && (viewTreeObserver = c1826520xdC3.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG = new ViewTreeObserverOnGlobalLayoutListenerC521800KdG(this, 2);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521800KdG);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521800KdG, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C457201qE.LIZ(C1813460xI8.LIZ(uS().LLILLJJLI, AFwS269S0000000_27.get$arr$(350)), this, new C1813470xI9(this, null));
        C457201qE.LIZ(C1813460xI8.LIZ(uS().LLILLJJLI, AFwS269S0000000_27.get$arr$(341)), this, new C1813480xIA(this, null));
        uS().vQ2(new C1777370wLv(this.LLLI, this.LLLII));
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.msd, (Fragment) this.LLLIIIIL.getValue());
        c19ehLJIIJ.LIZIZ(R.id.msd, (Fragment) this.LLLIIIL.getValue());
        c19ehLJIIJ.LJIILL((Fragment) this.LLLIIIIL.getValue());
        c19ehLJIIJ.LJIILL((Fragment) this.LLLIIIL.getValue());
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C20441214yg.LIZIZ("AutoPostLivingPanelDialog", "onCreateContentView");
        return C786410Ut5.Td(layoutInflater, R.layout.dch, viewGroup, false);
    }
}
