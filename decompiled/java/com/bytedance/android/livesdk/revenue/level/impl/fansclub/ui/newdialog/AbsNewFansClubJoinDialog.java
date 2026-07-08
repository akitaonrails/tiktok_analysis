package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog;

import X.C0TGE;
import X.C1094580eae;
import X.C1095480ec6;
import X.C1148210fz9;
import X.C1161920gLG;
import X.C16F5;
import X.C16G6;
import X.C19322110iZ;
import X.C1CC2;
import X.C20484615Do;
import X.C20736316Cj;
import X.C2108408Nu;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C416770GVv;
import X.C497740JfY;
import X.C518180KTw;
import X.C786410Ut5;
import X.C823050WQl;
import X.InterfaceC1095170ebb;
import X.ViewTreeObserverOnGlobalLayoutListenerC1151700g4m;
import Y.ACListenerS152S0100000_17;
import Y.AObserverS221S0100000_17;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.revenue.level.api.event.DismissFansClubGuideDialogEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.AbsFansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;
import webcast.data.FansClubBanner;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbsNewFansClubJoinDialog extends AbsFansClubJoinDialog implements InterfaceC1095170ebb {
    public final boolean LLILZLL;
    public C16F5 LLIZ;
    public ImageView LLIZLLLIL;
    public LinearLayout LLJ;
    public C16F5 LLJI;
    public FrameLayout LLJIJIL;
    public FrameLayout LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;
    public C16F5 LLJJ;
    public ImageView LLJJI;
    public long LLJJIII;
    public C16F5 LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public LinearLayout LLJJJIL;
    public LinearLayout LLJJJJ;
    public View LLJJJJJIL;
    public String LLJJJJLIIL;
    public final /* synthetic */ C1095480ec6 LLILZIL = new C1095480ec6();
    public String LLJJIJI = "";
    public final int LLJJL = C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(118.0f));

    public abstract void NR(View view);

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public void OR() {
        ViewTreeObserver viewTreeObserver;
        MutableLiveData<Long> mutableLiveData;
        MutableLiveData<FansClubBanner> mutableLiveData2;
        MutableLiveData<String> mutableLiveData3;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, DismissFansClubGuideDialogEvent.class, new AwS596S0100000_17(this, 239));
        }
        JoinDialogViewModel joinDialogViewModel = this.LLILLL;
        if (joinDialogViewModel != null && (mutableLiveData3 = joinDialogViewModel.LLILZLL) != null) {
            mutableLiveData3.observe(this, new AObserverS221S0100000_17(this, 23));
        }
        JoinDialogViewModel joinDialogViewModel2 = this.LLILLL;
        if (joinDialogViewModel2 != null && (mutableLiveData2 = joinDialogViewModel2.LLIZ) != null) {
            mutableLiveData2.observe(this, new AObserverS221S0100000_17(this, 24));
        }
        JoinDialogViewModel joinDialogViewModel3 = this.LLILLL;
        if (joinDialogViewModel3 != null && (mutableLiveData = joinDialogViewModel3.LLIZLLLIL) != null) {
            mutableLiveData.observe(this, new AObserverS221S0100000_17(this, 25));
        }
        View view = getView();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m = new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 7);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1151700g4m, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    public final boolean RR() {
        return Intrinsics.LJFF(this.LL, "back_pack_gift_panel") || Intrinsics.LJFF(this.LL, "watch_live_heart_me_popup") || this.LLILZIL.LL == 16;
    }

    public final void SR() {
        C16F5 c16f5 = this.LLIZ;
        boolean z = !Intrinsics.LJFF(c16f5 != null ? c16f5.getBackground() : null, C497740JfY.LJIIJ(R.drawable.drj));
        DataChannel dataChannel = this.dataChannel;
        String str = this.LL;
        Boolean boolValueOf = Boolean.valueOf(z);
        Integer numValueOf = Integer.valueOf(this.LLILZIL.LL);
        JoinDialogViewModel joinDialogViewModel = this.LLILLL;
        C518180KTw.LJIILLIIL(dataChannel, "show", str, boolValueOf, "", numValueOf, joinDialogViewModel != null ? joinDialogViewModel.LLJI : false, this.LLILZ);
        C518180KTw.LJJIIJZLJL(this.dataChannel, this.LL, "fan", this.LLILZIL.LL, false, false, false);
    }

    public void UR() {
        IGiftService iGiftService = (IGiftService) C2108408Nu.LIZ.LIZIZ(IGiftService.class);
        Gift fansClubGift = iGiftService != null ? iGiftService.getFansClubGift() : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u.LJJIII(u.LJJIII(C497740JfY.LJIJI(2131853146), "%@", e3.d, false), "%d", String.valueOf(fansClubGift != null ? fansClubGift.diamondCount : 1), false));
        Drawable drawableMutate = getResources().getDrawable(R.drawable.etw).mutate();
        drawableMutate.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
        C16G6.LIZIZ(drawableMutate, C497740JfY.LJJ() ? 1 : 0);
        C786410Ut5.q2(spannableStringBuilder, new C416770GVv(drawableMutate), r6.length() - 4, r6.length() - 3, 34);
        C16F5 c16f5 = this.LLIZ;
        if (c16f5 != null) {
            c16f5.setText(spannableStringBuilder);
        }
    }

    public void VR() {
        LinearLayout linearLayout = this.LLJJIJIL;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS152S0100000_17(this, 62));
        }
        LinearLayout linearLayout2 = this.LLJJJ;
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, new ACListenerS152S0100000_17(this, 63));
        }
        LinearLayout linearLayout3 = this.LLJJJIL;
        if (linearLayout3 != null) {
            C786410Ut5.R7(linearLayout3, new ACListenerS152S0100000_17(this, 64));
        }
        LinearLayout linearLayout4 = this.LLJJJJ;
        if (linearLayout4 != null) {
            C786410Ut5.R7(linearLayout4, new ACListenerS152S0100000_17(this, 65));
        }
        C16F5 c16f5 = this.LLJJIJIIJIL;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS152S0100000_17(this, 66));
        }
    }

    public final void close() {
        if (!this.LLILZLL) {
            dismiss();
            return;
        }
        C20484615Do c20484615DoLIZJ = C19322110iZ.LIZJ(getView());
        if (c20484615DoLIZJ != null) {
            c20484615DoLIZJ.LIZ(1);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return this.LLILZLL ? new FrameLayout.LayoutParams(-1, -1) : super.getCustomLayoutParams();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        String str = this.LL;
        DataChannel dataChannel = this.dataChannel;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIII;
        JoinDialogViewModel joinDialogViewModel = this.LLILLL;
        C518180KTw.LJJIJIL(str, dataChannel, jCurrentTimeMillis, joinDialogViewModel != null ? joinDialogViewModel.LLJI : false, this.LLILZ, Math.max(0L, (joinDialogViewModel == null || (mutableLiveData = joinDialogViewModel.LLIZLLLIL) == null || (value = mutableLiveData.getValue()) == null) ? 0L : value.longValue()), "fan", false);
        DataChannelGlobal.LLILZ.JQ2(C1148210fz9.class, "");
        super.onDestroy();
    }

    public AbsNewFansClubJoinDialog(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC1095170ebb
    public final void LP(int i) {
        this.LLILZIL.LL = i;
    }

    public void PR(View view) {
        FrameLayout frameLayout;
        this.LLJJIII = System.currentTimeMillis();
        View viewFindViewById = view.findViewById(R.id.fy0);
        if (!this.LLILZLL) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 61), viewFindViewById);
        }
        this.LLJ = (LinearLayout) view.findViewById(R.id.ya2);
        this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.y1s);
        this.LLJIJIL = (FrameLayout) view.findViewById(R.id.a5j);
        this.LLIZ = (C16F5) view.findViewById(R.id.a24);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.hny);
        this.LLJILLL = (C16F5) view.findViewById(R.id.xfy);
        this.LLIZLLLIL = (ImageView) view.findViewById(R.id.b1s);
        if (!this.LLILZLL) {
            this.LLJILJIL = (FrameLayout) view.findViewById(R.id.f5z);
        }
        this.LLJJ = (C16F5) view.findViewById(R.id.ba2);
        this.LLJJIJIL = (LinearLayout) view.findViewById(R.id.bpo);
        this.LLJJJ = (LinearLayout) view.findViewById(R.id.h72);
        this.LLJJJIL = (LinearLayout) view.findViewById(R.id.iwn);
        this.LLJJJJ = (LinearLayout) view.findViewById(R.id.mmb);
        this.LLJJJJJIL = view.findViewById(R.id.fsx);
        this.LLJI = (C16F5) view.findViewById(R.id.ya0);
        this.LLJJI = (ImageView) view.findViewById(R.id.sl1);
        try {
            View viewGenerateCPCTopView = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).generateCPCTopView(getContext(), false, AFwS205S0000000_17.get$arr$(104));
            if (viewGenerateCPCTopView != null && viewGenerateCPCTopView.getParent() == null && (frameLayout = this.LLJILJIL) != null) {
                frameLayout.addView(viewGenerateCPCTopView);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131853137));
        }
        UR();
    }

    @Override // X.InterfaceC1095170ebb
    public final void Rv(Map<String, ? extends Object> map) {
        this.LLILZIL.LLILLJJLI = map;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        try {
            if (!Intrinsics.LJFF(this.LLILLJJLI, "1")) {
                getDialogParams().LJI = 0.0f;
            } else {
                getDialogParams().LJI = 0.5f;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set dim error, msg=");
            sbLIZ.append(e.getMessage());
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), e);
        }
        PR(view);
        NR(view);
        VR();
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS152S0100000_17(this, 151));
        }
        ImageView imageView = this.LLJJI;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS152S0100000_17(this, 152));
        }
        if (((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).isFansCLubGiftLimited(this.dataChannel)) {
            C16F5 c16f5 = this.LLIZ;
            if (c16f5 != null) {
                c16f5.setBackground(C497740JfY.LJIIJ(R.drawable.drj));
            }
            C16F5 c16f52 = this.LLIZ;
            if (c16f52 != null) {
                c16f52.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, getContext()));
            }
            C16F5 c16f53 = this.LLIZ;
            if (c16f53 != null) {
                C786410Ut5.l8(c16f53, new ACListenerS152S0100000_17(this, 153));
            }
        } else {
            C16F5 c16f54 = this.LLIZ;
            if (c16f54 != null) {
                c16f54.setTextColor(C20736316Cj.LIZIZ(R.attr.eyw, getContext()));
            }
            C16F5 c16f55 = this.LLIZ;
            if (c16f55 != null) {
                C786410Ut5.l8(c16f55, new ACListenerS152S0100000_17(this, 154));
            }
        }
        OR();
        C1094580eae.LIZ.getClass();
        C823050WQl.LIZLLL().execute(C0TGE.LL);
    }
}
