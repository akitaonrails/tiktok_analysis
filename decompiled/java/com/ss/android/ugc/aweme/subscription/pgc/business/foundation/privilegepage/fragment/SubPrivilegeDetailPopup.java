package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment;

import X.C098200Yq;
import X.C0HE8;
import X.C0K4B;
import X.C1440005kM;
import X.C189200o6;
import X.C197039127h;
import X.C2095008Iq;
import X.C2261008tU;
import X.InterfaceC058200Jg;
import Y.ARunnableS104S0100000_4;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.common.PrivilegeBottomSheetBehavior;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPrivilegeDetailPopup extends SubscriptionBaseSheet {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyAmHELIOSJiEtPSY8Jms8OyYlISkpLiojKSIpZykhKSIhLCEnZhY5Kx8hITMlJSo0LQEpPS46JBUjOToj";
    public View LLJJLIIIJLLLLLLLZ;
    public ConstraintLayout LLJL;
    public FrameLayout LLJLIL;
    public ConstraintLayout LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public TuxTextView LLJLLIL;
    public C197039127h LLJLLL;
    public PrivilegeBottomSheetBehavior<ConstraintLayout> LLJZIJLIL;
    public SubscriptionPrivilegeDetailFragment LLL;
    public Boolean LLLFF;
    public String LLLFZ;
    public SubscriptionSceneContext LLLIIL;
    public final int LLJJJJLIIL = R.layout.fes;
    public final boolean LLJJL = true;
    public final String LLJZ = "";
    public final Map<String, String> LLLF = new LinkedHashMap();
    public String LLLFFI = "";
    public String LLLI = "";
    public String LLLII = "";
    public Function1<? super InterfaceC058200Jg, Unit> LLLIIII = AFwS237S0000000_7.get$arr$(210);
    public String LLLIIIIL = "";
    public boolean LLLIIIL = true;

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final float aS() {
        SubscriptionSceneContext subscriptionSceneContext = this.LLLIIL;
        return (subscriptionSceneContext == null || !subscriptionSceneContext.isInLiveRoom || subscriptionSceneContext.showDim) ? 0.5f : 0.0f;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        Window window;
        View decorView;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            C2261008tU.LIZ(decorView);
        }
        super.dismiss();
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (Intrinsics.LJFF(C0K4B.LIZ(), this.LLLIIL)) {
            C0K4B.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet, com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLJLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet, com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
            window2.setGravity(80);
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS104S0100000_4(this, 49));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final boolean cS() {
        return this.LLJJL;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Window window;
        View decorView;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            C2261008tU.LIZ(decorView);
        }
        C1440005kM.LIZ(new IEvent() { // from class: X.0K68
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        super.onCancel(dialogInterface);
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long jLongValue;
        boolean z;
        SubscriptionSceneContext subscriptionSceneContextLIZ;
        SubscriptionSceneContext subscriptionSceneContextLIZ2;
        SubscriptionSceneContext subscriptionSceneContextLIZ3;
        SubscriptionSceneContext subscriptionSceneContextLIZ4;
        Long lLJIILIIL;
        try {
            C189200o6.m2constructorimpl(null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        SubscriptionSceneContext subscriptionSceneContext = this.LLLIIL;
        if (subscriptionSceneContext == null) {
            String str = (String) ((LinkedHashMap) this.LLLF).get("room_id");
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            String str2 = this.LLLFFI;
            if (str2 == null || str2.length() == 0) {
                str2 = null;
            }
            String str3 = "";
            if (str2 == null && (str2 = (String) ((LinkedHashMap) this.LLLF).get("sec_anchor_id")) == null) {
                str2 = "";
            }
            String str4 = this.LLLI;
            String str5 = (String) ((LinkedHashMap) this.LLLF).get("enter_from_merge");
            if (str5 == null && ((subscriptionSceneContextLIZ4 = C0K4B.LIZ()) == null || (str5 = subscriptionSceneContextLIZ4.enterFromMerge) == null)) {
                str5 = "";
            }
            String str6 = (String) ((LinkedHashMap) this.LLLF).get("enter_method");
            if (str6 == null && ((subscriptionSceneContextLIZ3 = C0K4B.LIZ()) == null || (str6 = subscriptionSceneContextLIZ3.enterMethod) == null)) {
                str6 = "";
            }
            String str7 = (String) ((LinkedHashMap) this.LLLF).get("request_id");
            if (str7 == null && ((subscriptionSceneContextLIZ2 = C0K4B.LIZ()) == null || (str7 = subscriptionSceneContextLIZ2.requestId) == null)) {
                str7 = "";
            }
            String str8 = (String) ((LinkedHashMap) this.LLLF).get("video_id");
            if (str8 == null && ((subscriptionSceneContextLIZ = C0K4B.LIZ()) == null || (str8 = subscriptionSceneContextLIZ.videoId) == null)) {
                str8 = "";
            }
            if (jLongValue > 0) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJFF = Intrinsics.LJFF(((LinkedHashMap) this.LLLF).get("is_subscribe"), "1");
            String str9 = this.LLLFZ;
            if (str9 != null) {
                str3 = str9;
            }
            subscriptionSceneContext = new SubscriptionSceneContext(jLongValue, 0L, str2, str5, str6, str4, str7, str8, z, zLJFF, "", false, str3, 0L, 0L, "", "", false, this.LLJZ, null, 2);
        }
        this.LLLIIL = subscriptionSceneContext;
        C0K4B.LIZIZ(subscriptionSceneContext);
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C0HE8.LIZ(layoutInflaterOnGetLayoutInflater.getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[PHI: r3
      0x001d: PHI (r3v1 android.view.View) = (r3v0 android.view.View), (r3v8 android.view.View) binds: [B:3:0x000a, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailPopup.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
