package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui;

import X.C098200Yq;
import X.C0KVU;
import X.C1094610eah;
import X.C1095480ec6;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1213340hgC;
import X.C1685300txQ;
import X.C16F5;
import X.C16G6;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20736316Cj;
import X.C416770GVv;
import X.C454590Hs9;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C518180KTw;
import X.C786410Ut5;
import X.InterfaceC1095170ebb;
import X.InterfaceC1095550ecD;
import Y.ACListenerS152S0100000_17;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.level.FansClubPrivilegeConfigSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS141S0201000_17;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubJoinFragment extends Fragment implements InterfaceC1095170ebb, InterfaceC1095550ecD {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDHELIOSk2JGslJD8/ZiMtJzwwJDAuZzo6ZgMtJzwQJDAuAyA6JgM+KCg+LSs4";
    public final /* synthetic */ C1095480ec6 LL = new C1095480ec6();
    public final long LLILLJJLI = System.currentTimeMillis();
    public String LLILLL = "";
    public boolean LLILZ;
    public JoinDialogViewModel LLILZIL;

    @Override // X.InterfaceC1095550ecD
    public final boolean J6() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        super.onDestroy();
        if (this.LLILZ) {
            String str = this.LLILLL;
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
            JoinDialogViewModel joinDialogViewModel = this.LLILZIL;
            C518180KTw.LJJIJIL(str, dataChannelLJ, jCurrentTimeMillis, joinDialogViewModel != null ? joinDialogViewModel.LLJI : false, "", Math.max(0L, (joinDialogViewModel == null || (mutableLiveData = joinDialogViewModel.LLIZLLLIL) == null || (value = mutableLiveData.getValue()) == null) ? 0L : value.longValue()), "fan", false);
        }
    }

    @Override // X.InterfaceC1095550ecD
    public final void LLLLZLL(boolean z) {
        this.LLILZ = z;
        if (z) {
            C518180KTw.LJJIIJZLJL(C475510Ikn.LJ(this), this.LLILLL, "fan", this.LL.LL, !((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).isFansCLubGiftLimited(C475510Ikn.LJ(this)), false, false);
        }
    }

    @Override // X.InterfaceC1095170ebb
    public final void LP(int i) {
        this.LL.LL = i;
    }

    @Override // X.InterfaceC1095170ebb
    public final void Rv(Map<String, ? extends Object> map) {
        this.LL.LLILLJJLI = map;
    }

    @Override // X.InterfaceC1095550ecD
    public final void TN(AwS141S0201000_17 awS141S0201000_17) {
        C1213340hgC c1213340hgC;
        View view = getView();
        if (view != null && (c1213340hgC = (C1213340hgC) view.findViewById(R.id.u3e)) != null) {
            if (c1213340hgC.getScrollY() == 0) {
                awS141S0201000_17.invoke();
                return;
            }
            c1213340hgC.LL = true;
            c1213340hgC.LLILLJJLI = awS141S0201000_17;
            c1213340hgC.smoothScrollTo(0, 0);
        }
    }

    @Override // X.InterfaceC1095550ecD
    public final void cp(boolean z) {
        View viewFindViewById;
        View viewFindViewById2;
        if (z) {
            View view = getView();
            if (view != null && (viewFindViewById2 = view.findViewById(R.id.jvk)) != null) {
                C500260Jjc.LLFFF(viewFindViewById2);
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 == null || (viewFindViewById = view2.findViewById(R.id.jvk)) == null) {
            return;
        }
        C500260Jjc.LJIILLIIL(viewFindViewById);
    }

    public final void MR(int i, ViewGroup viewGroup) {
        int size;
        ImageView imageView;
        FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig;
        FansClubPrivilegeConfigSetting fansClubPrivilegeConfigSetting = FansClubPrivilegeConfigSetting.INSTANCE;
        List<FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig> list = fansClubPrivilegeConfigSetting.getValue().privilegeElements;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (i >= size) {
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            return;
        }
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        TextView textView = null;
        if (viewGroup != null) {
            imageView = (ImageView) viewGroup.findViewById(R.id.lry);
            textView = (TextView) viewGroup.findViewById(R.id.tv_privilege);
            if (textView != null) {
                textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, getContext()));
            }
        } else {
            imageView = null;
        }
        List<FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig> list2 = fansClubPrivilegeConfigSetting.getValue().privilegeElements;
        if (list2 != null && (liveFansPrivilegeElementConfig = (FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig) ListProtector.get(list2, i)) != null) {
            C1094610eah.LIZ.getClass();
            C1094610eah.LIZ(imageView, textView, liveFansPrivilegeElementConfig);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Gift fansClubGift;
        int i;
        super.onViewCreated(view, bundle);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.dg9);
        boolean z = false;
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setGravity(16);
        if (Build.VERSION.SDK_INT >= 27) {
            try {
                appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(18, 24, 1, 1);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        String strLIZ = C0KVU.LIZ(C500260Jjc.LJIIIIZZ(C475510Ikn.LJ(this)));
        if (strLIZ.codePointCount(0, strLIZ.length()) > 10) {
            strLIZ = strLIZ.substring(0, strLIZ.offsetByCodePoints(0, 10));
        }
        appCompatTextView.setText(C497740JfY.LJIJJ(2131852386, strLIZ));
        View viewFindViewById = view.findViewById(R.id.jvk);
        if (C454590Hs9.LIZ(getContext())) {
            str = "ttlive_fans_club_badge_rtl.png";
        } else {
            str = "ttlive_fans_club_badge.png";
        }
        C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_fans_club_join_dialog", str);
        MR(0, (ViewGroup) view.findViewById(R.id.nda));
        MR(1, (ViewGroup) view.findViewById(R.id.nhj));
        MR(2, (ViewGroup) view.findViewById(R.id.niv));
        MR(3, (ViewGroup) view.findViewById(R.id.ndf));
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.m03);
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        if (iGiftService != null) {
            fansClubGift = iGiftService.getFansClubGift();
        } else {
            fansClubGift = null;
        }
        String strLJJIII = u.LJJIII(C497740JfY.LJIJI(2131853146), "%@", e3.d, false);
        if (fansClubGift != null) {
            i = fansClubGift.diamondCount;
        } else {
            i = 1;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u.LJJIII(strLJJIII, "%d", String.valueOf(i), false));
        Drawable drawableMutate = getResources().getDrawable(R.drawable.etw).mutate();
        drawableMutate.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
        C16G6.LIZIZ(drawableMutate, C497740JfY.LJJ() ? 1 : 0);
        C786410Ut5.q2(spannableStringBuilder, new C416770GVv(drawableMutate), r7.length() - 4, r7.length() - 2, 34);
        if (c16f5 != null) {
            c16f5.setText(spannableStringBuilder);
        }
        boolean zIsFansCLubGiftLimited = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).isFansCLubGiftLimited(C475510Ikn.LJ(this));
        if (zIsFansCLubGiftLimited) {
            if (c16f5 != null) {
                c16f5.setBackground(C497740JfY.LJIIJ(R.drawable.drj));
                c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, getContext()));
                C786410Ut5.l8(c16f5, new ACListenerS152S0100000_17(this, 124));
            }
        } else if (c16f5 != null) {
            c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.eyw, getContext()));
            C786410Ut5.l8(c16f5, new ACListenerS152S0100000_17(this, 125));
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        String str2 = this.LLILLL;
        Boolean boolValueOf = Boolean.valueOf(!zIsFansCLubGiftLimited);
        Integer numValueOf = Integer.valueOf(this.LL.LL);
        JoinDialogViewModel joinDialogViewModel = this.LLILZIL;
        if (joinDialogViewModel != null) {
            z = joinDialogViewModel.LLJI;
        }
        C518180KTw.LJIILLIIL(dataChannelLJ, "show", str2, boolValueOf, "", numValueOf, z, "");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ghu, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
