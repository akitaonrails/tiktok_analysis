package com.bytedance.android.livesdk.chatroom.ui;

import X.C098200Yq;
import X.C0IPC;
import X.C0KWD;
import X.C0KYM;
import X.C1161920gLG;
import X.C11NJ;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1BHX;
import X.C2177501AJw;
import X.C259800zU;
import X.C497740JfY;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC490450JLf;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS40S0210000_7;
import Y.AfS176S0100000_7;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.BaseDialogFragmentV2;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveStickerDonationDialog extends BaseDialogFragmentV2 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPTHELIOS08JyhiPCZ9BCw6LBwnISYnLD0XJystPSY8JgElKCM8Lw==";
    public String LL;
    public OrganizationModel LLILLJJLI;
    public InterfaceC490450JLf LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL = true;
    public final C11NJ LLILZLL = new C11NJ();
    public View LLIZ;
    public LiveIconView LLIZLLLIL;
    public C1BHX LLJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C0IPC.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC490450JLf interfaceC490450JLf = this.LLILLL;
        if (interfaceC490450JLf != null) {
            interfaceC490450JLf.LIZ();
        }
    }

    @Override // com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LLILZLL.LLILLJJLI) {
            return;
        }
        this.LLILZLL.dispose();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.ahb);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setCanceledOnTouchOutside(true);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = (int) (((double) C497740JfY.LJIILLIIL()) * 0.6d);
            window.setAttributes(attributes);
            window.setDimAmount(0.0f);
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C1BHX c1bhx;
        super.onViewCreated(view, bundle);
        this.LLIZ = view.findViewById(R.id.w5m);
        view.findViewById(R.id.ex3);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.w5j);
        this.LLIZLLLIL = liveIconView;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 0);
        }
        TextView textView = (TextView) view.findViewById(R.id.w5n);
        if (textView != null && this.LLILLJJLI != null) {
            C786410Ut5.T7(textView, new ACListenerS142S0100000_7(this, 33));
            this.LLILZLL.LIZ(C784440Upu.LIZ().LJ(C0KWD.class).LJJLJLI(new AfS176S0100000_7(this, 31)));
            this.LLILZLL.LIZ(C784440Upu.LIZ().LJ(C2177501AJw.class).LJJLJLI(new AfS176S0100000_7(this, 32)));
        }
        if (getContext() != null && (str = this.LL) != null && str.length() != 0) {
            String str2 = this.LL;
            if (str2 == null) {
                str2 = "";
            }
            if (this.LLILZ) {
                C259800zU c259800zU = new C259800zU();
                this.LLJ = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).D60(view.getContext(), str2, new AwS373S0200000_7(c259800zU, (C259800zU<SparkThirdContext>) this, (LiveStickerDonationDialog) 4));
                ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vsu);
                if (viewGroup != null) {
                    viewGroup.addView(this.LLJ, -1, -1);
                }
                SparkThirdContext sparkThirdContext = (SparkThirdContext) c259800zU.element;
                if (sparkThirdContext != null && (c1bhx = this.LLJ) != null) {
                    c1bhx.LIZ(sparkThirdContext);
                    return;
                }
                return;
            }
            C0KYM c0kym = new C0KYM();
            c0kym.LJI(str2);
            c0kym.LIZIZ.authority("webview");
            c0kym.LJFF(true);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(view.getContext(), c0kym.LIZ().toString(), this, true, new AwS586S0100000_7(this, 66));
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.vsu);
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -1);
            return;
        }
        C766270U4b.LIZLLL(2131843632);
    }

    public final void NR(String str, Function0 function0, boolean z) {
        LiveIconView liveIconView;
        int i;
        String path = "";
        if (str == null) {
            str = "";
        }
        View view = this.LLIZ;
        int i2 = 8;
        if (view != null && this.LLILLJJLI != null) {
            if (this.LLILZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        LiveIconView liveIconView2 = this.LLIZLLLIL;
        if (liveIconView2 != null) {
            if (this.LLILZIL || z) {
                i2 = 0;
            }
            C786410Ut5.LLJJIJIL(liveIconView2, i2);
            if (!TextUtils.isEmpty(str)) {
                path = UriProtector.parse(str).getPath();
            }
            if (getContext() != null && (liveIconView = this.LLIZLLLIL) != null) {
                liveIconView.setIconAttr(R.attr.d33);
            }
            if (path != null && a0.LJJIIZI(path, "/donate/complete", false)) {
                LiveIconView liveIconView3 = this.LLIZLLLIL;
                if (liveIconView3 != null) {
                    C786410Ut5.g8(liveIconView3, new ACListenerS142S0100000_7(this, 36));
                    return;
                }
                return;
            }
            LiveIconView liveIconView4 = this.LLIZLLLIL;
            if (liveIconView4 == null) {
                return;
            }
            C786410Ut5.g8(liveIconView4, new ACListenerS40S0210000_7(function0, this, z, 1));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewSd = C786410Ut5.Sd(R.layout.hn1, layoutInflater, viewGroup);
        C19GS c19gs = null;
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }
}
