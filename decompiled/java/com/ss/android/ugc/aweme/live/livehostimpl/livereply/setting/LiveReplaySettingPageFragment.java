package com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting;

import X.C01GW;
import X.C0OM1;
import X.C0PEM;
import X.C1119920fFW;
import X.C1238760iLC;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C1622206Wu;
import X.C1749280vcc;
import X.C1813620xIO;
import X.C1833360xoE;
import X.C1833370xoF;
import X.C1833380xoG;
import X.C1833410xoJ;
import X.C1833420xoK;
import X.C1833430xoL;
import X.C1833440xoM;
import X.C1833450xoN;
import X.C1833460xoO;
import X.C1833470xoP;
import X.C1833560xoY;
import X.C1833570xoZ;
import X.C1833580xoa;
import X.C1864480ycQ;
import X.C19292910dr;
import X.C19318810i2;
import X.C19319010i4;
import X.C19319110i5;
import X.C19319810iC;
import X.C19323610io;
import X.C19719912Dl;
import X.C20684815ws;
import X.C20736316Cj;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C338490DOt;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C444920HcY;
import X.C452070Ho5;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5182020e;
import X.C724750Sbp;
import X.C785810Us7;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1833530xoV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUserPostHighlightSetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayHighlightRecoverSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes28.dex */
@InterfaceC836760Ws6
public final class LiveReplaySettingPageFragment extends BasePage implements InterfaceC344240DeY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklHELIOSPyohLTUgMGEgLTE4ICE0ZgklPyoBLTUgKDYALTE4ICE0GCQrLAkhKSIhLCEn";
    public Integer LLJ;
    public Boolean LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public Integer LLJILLL;
    public Integer LLJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public TuxNavBar LLJJIII;
    public C1749280vcc LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C19319110i5 LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C1833560xoY LLJL;
    public C1833370xoF LLJLIL;
    public C1833430xoL LLJLILLLLZIIL;
    public C1833420xoK LLJLL;
    public C1833360xoE LLJLLIL;
    public C1833410xoJ LLJLLL;
    public C1833470xoP LLJZ;
    public C1833440xoM LLJZIJLIL;
    public C1833460xoO LLL;
    public C1833380xoG LLLF;
    public C1833450xoN LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveReplaySettingPageFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/setting/viewmodel/LiveReplySettingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveReplaySettingPageFragment() {
        this(null, null, null, null, null, 127);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.dd3;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Integer numLIZJ;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS571S0100000_27(this, 532));
        int iIntValue = 0;
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getResources().getString(2131855679);
        c0om1.LIZJ = c1250250idj;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bk, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        c0om1.LIZJ(iIntValue);
        return c0om1;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv ZR() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rn0) : null;
            this.LLJJI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C1749280vcc aS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.z18) : null;
            this.LLJJIJI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C19318810i2 bS() {
        return (C19318810i2) this.LLJJIJIL.getValue();
    }

    public final LiveReplySettingViewModel cS() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return (LiveReplySettingViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C19292910dr c19292910dr;
        C19319810iC c19319810iCLIZIZ;
        super.onDestroyView();
        C1833570xoZ c1833570xoZ = C1833570xoZ.LIZ;
        C1833410xoJ c1833410xoJ = this.LLJLLL;
        String str = c1833410xoJ != null ? c1833410xoJ.LJFF : null;
        C1833420xoK c1833420xoK = this.LLJLL;
        Boolean bool = c1833420xoK != null ? c1833420xoK.LJ : null;
        C1833360xoE c1833360xoE = this.LLJLLIL;
        Integer numValueOf = c1833360xoE != null ? Integer.valueOf((int) c1833360xoE.LJFF) : null;
        C1833370xoF c1833370xoF = this.LLJLIL;
        Boolean bool2 = c1833370xoF != null ? c1833370xoF.LIZLLL : null;
        C1833440xoM c1833440xoM = this.LLJZIJLIL;
        Boolean bool3 = c1833440xoM != null ? c1833440xoM.LIZLLL : null;
        String str2 = this.LLJILJILJ;
        if (str2 == null) {
            str2 = "";
        }
        C1833430xoL c1833430xoL = this.LLJLILLLLZIIL;
        Boolean bool4 = c1833430xoL != null ? c1833430xoL.LJI : null;
        String str3 = this.LLJIJIL;
        String str4 = this.LLJILJIL;
        C1833380xoG c1833380xoG = this.LLLF;
        Boolean boolValueOf = Boolean.valueOf(c1833380xoG != null && c1833380xoG.LJIILL == 1);
        c1833570xoZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (str4 == null) {
            str4 = C1833570xoZ.LIZIZ;
        }
        c2344009Gk.LJIIIIZZ("enter_from_page", str4);
        if (str3 == null) {
            str3 = C1833570xoZ.LIZJ;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("event_page", "live_replay");
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        if (str != null) {
            c2344009Gk.LJFF("subscribe_inbox_status", str);
        }
        if (numValueOf != null) {
            c2344009Gk.LIZJ(numValueOf.intValue(), "share_to_moderators_num");
        }
        if (bool != null) {
            c2344009Gk.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(bool.booleanValue())) ? 1 : 0, "is_share_guest_open");
        }
        if (bool2 != null) {
            c2344009Gk.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(bool2.booleanValue())) ? 1 : 0, "is_amplify_open");
        }
        if (bool4 != null) {
            c2344009Gk.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(bool4.booleanValue())) ? 1 : 0, "is_record_elements_open");
        }
        if (bool3 != null) {
            c2344009Gk.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(bool3.booleanValue())) ? 1 : 0, "is_auto_add_post_open");
        }
        if (boolValueOf != null) {
            c2344009Gk.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(boolValueOf.booleanValue())) ? 1 : 0, "is_auto_post_open");
        }
        C20684815ws.LJIILLIIL("livesdk_live_replay_setting_leave", c2344009Gk.LIZ);
        C1833410xoJ c1833410xoJ2 = this.LLJLLL;
        if (c1833410xoJ2 != null && (c19292910dr = c1833410xoJ2.LJI) != null && (c19319810iCLIZIZ = c19292910dr.LIZIZ()) != null && c19319810iCLIZIZ.LLJJJJ && c19319810iCLIZIZ.LLJJIJIL) {
            C1440005kM.LIZ(new IEvent() { // from class: X.0xoR
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
        }
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        if (u.LJIJI(this.LLJIJIL, "inbox", false)) {
            C1833580xoa.LJI();
        }
    }

    public final void dS() {
        cS().setState(AFwS269S0000000_27.get$arr$(461));
        LiveReplySettingViewModel liveReplySettingViewModelCS = cS();
        C23250099c.LIZLLL(liveReplySettingViewModelCS.getAssemVMScope(), C0PEM.LIZJ, null, new C1813620xIO(liveReplySettingViewModelCS, this.LLJ, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.LLJJL) {
            LiveReplySettingViewModel liveReplySettingViewModelCS = cS();
            C23250099c.LIZLLL(liveReplySettingViewModelCS.getAssemVMScope(), C0PEM.LIZJ, null, new C1813620xIO(liveReplySettingViewModelCS, this.LLJ, null), 2);
        }
        this.LLJJL = false;
    }

    public final InterfaceC1833530xoV gS(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        switch (i) {
                            case BdTuring.TYPE_ECAF /* 9 */:
                                return this.LLJZIJLIL;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                return this.LLLFF;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                return this.LLLF;
                            default:
                                return null;
                        }
                    }
                    return this.LLL;
                }
                return this.LLJLILLLLZIIL;
            }
            return this.LLJLLL;
        }
        return this.LLJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.CharSequence, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.0GdJ] */
    /* JADX WARN: Type inference failed for: r11v11, types: [X.0wBP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v14, types: [X.0GdJ, X.0hlc, android.view.View, android.view.View$OnClickListener, com.bytedance.tux.status.loading.TuxSpinner, java.lang.Integer, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v15, types: [X.0GdJ, X.0hlc, android.view.View, android.view.View$OnClickListener, com.bytedance.tux.status.loading.TuxSpinner, java.lang.Integer, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v16, types: [X.0GdJ, X.0hlc, android.view.View, android.view.View$OnClickListener, com.bytedance.tux.status.loading.TuxSpinner, java.lang.CharSequence, java.lang.Integer, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.0wBP, java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.0wBP, java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [X.0wBP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r15v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r16v11, types: [com.bytedance.tux.status.loading.TuxSpinner] */
    /* JADX WARN: Type inference failed for: r16v12, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r16v13, types: [com.bytedance.tux.status.loading.TuxSpinner] */
    /* JADX WARN: Type inference failed for: r16v6, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r16v7, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r17v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v10, types: [X.15yW] */
    /* JADX WARN: Type inference failed for: r18v2, types: [X.15yW] */
    /* JADX WARN: Type inference failed for: r18v4, types: [X.15yW] */
    /* JADX WARN: Type inference failed for: r18v5, types: [X.15yW] */
    /* JADX WARN: Type inference failed for: r19v10, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r19v2, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r19v4, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r19v5, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r20v10, types: [X.0GdJ] */
    /* JADX WARN: Type inference failed for: r20v11, types: [X.0hlc] */
    /* JADX WARN: Type inference failed for: r20v2, types: [X.0GdJ] */
    /* JADX WARN: Type inference failed for: r20v4, types: [X.0GdJ] */
    /* JADX WARN: Type inference failed for: r20v5, types: [X.0GdJ] */
    /* JADX WARN: Type inference failed for: r20v9, types: [X.0hlc] */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v10, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r24v8, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r25v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r25v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r26v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r26v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.0wBP] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.0wBP] */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        boolean z;
        String string2;
        String string3;
        String string4;
        C1833460xoO c1833460xoO;
        C1833430xoL c1833430xoL;
        int length;
        int length2;
        int iIntValue;
        int iIntValue2;
        Bundle arguments;
        String string5;
        Integer numLJIIJJI;
        int iIntValue3;
        Bundle arguments2;
        String string6;
        Integer numLJIIJJI2;
        int iIntValue4;
        String string7;
        String string8;
        Boolean boolValueOf;
        super.onViewCreated(view, bundle);
        this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.o8_);
        boolean z2 = false;
        int iValueOf = 0;
        if (!Intrinsics.LJFF(this.LLJILJIL, "livetake_page") && !Intrinsics.LJFF(this.LLJILJIL, "liveroom_page")) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvZR = ZR();
            if (viewOnAttachStateChangeListenerC20604515jvZR != null) {
                C426750GoL.LJIIL(viewOnAttachStateChangeListenerC20604515jvZR, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 16);
            }
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvZR2 = ZR();
            if (viewOnAttachStateChangeListenerC20604515jvZR2 != null) {
                C426750GoL.LJIIL(viewOnAttachStateChangeListenerC20604515jvZR2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 16);
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string = arguments3.getString("style");
        } else {
            string = null;
        }
        this.LLJJJJ = string;
        if (this.LLJI == null) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                boolValueOf = Boolean.valueOf(arguments4.getBoolean("highlight_in_preview_page", false));
            } else {
                boolValueOf = null;
            }
            this.LLJI = boolValueOf;
        }
        String str = this.LLJILJIL;
        boolean z3 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = "";
        if (z) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                string8 = arguments5.getString("enter_from_page", "");
            } else {
                string8 = null;
            }
            this.LLJILJIL = string8;
        }
        String str3 = this.LLJIJIL;
        if (str3 == null || str3.length() == 0) {
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                string2 = arguments6.getString("enter_from", "");
            } else {
                string2 = null;
            }
            this.LLJIJIL = string2;
        }
        if (this.LLJ == null) {
            Bundle arguments7 = getArguments();
            if (arguments7 != null) {
                iValueOf = Integer.valueOf(arguments7.getInt(Scene.SCENE_SERVICE, 0));
            }
            this.LLJ = iValueOf;
        }
        String str4 = this.LLJILJILJ;
        if (str4 == null || str4.length() == 0) {
            Bundle arguments8 = getArguments();
            if (arguments8 != null) {
                string3 = arguments8.getString("enter_method", "");
            } else {
                string3 = null;
            }
            this.LLJILJILJ = string3;
        }
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            string4 = arguments9.getString("template_id", "");
        } else {
            string4 = null;
        }
        this.LLJJJJLIIL = string4;
        if (u.LJIJI(this.LLJIJIL, "inbox", false)) {
            C1833570xoZ c1833570xoZ = C1833570xoZ.LIZ;
            String str5 = this.LLJILJIL;
            if (str5 == null) {
                str5 = "";
            }
            c1833570xoZ.getClass();
            C1833570xoZ.LIZIZ = str5;
            String str6 = this.LLJIJIL;
            if (str6 == null) {
                str6 = "";
            }
            C1833570xoZ.LIZJ = str6;
        }
        Bundle arguments10 = getArguments();
        if (arguments10 != null && (string7 = arguments10.getString("source_params")) != null) {
            str2 = string7;
        }
        this.LLJJJJJIL = str2;
        if (this.LLJILLL == null && (arguments2 = getArguments()) != null && (string6 = arguments2.getString("notification_reach_type")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(string6)) != null && (iIntValue4 = numLJIIJJI2.intValue()) >= 0) {
            this.LLJILLL = Integer.valueOf(iIntValue4);
        }
        if (this.LLJJ == null && (arguments = getArguments()) != null && (string5 = arguments.getString("notification_auto_turn_on_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string5)) != null && (iIntValue3 = numLJIIJJI.intValue()) >= 0) {
            this.LLJJ = Integer.valueOf(iIntValue3);
        }
        this.LLJL = new C1833560xoY(this.LLJILJILJ, this.LLJIJIL, this.LLJILJIL);
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.n5w);
            } else {
                viewFindViewById = null;
            }
            this.LLJJIII = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        if (tuxNavBar != null) {
            Integer num = this.LLJ;
            if (num != null && num.intValue() == 0) {
                C500260Jjc.LLFFF(tuxNavBar);
                if (u.LJIJI(this.LLJIJIL, "highlight_clips", false)) {
                    C0OM1 c0om1 = new C0OM1();
                    C1250250idj c1250250idj = new C1250250idj();
                    c1250250idj.LIZJ = getString(2131852996);
                    c0om1.LIZJ = c1250250idj;
                    C1251150ifB c1251150ifB = new C1251150ifB();
                    c1251150ifB.LIZLLL();
                    c1251150ifB.LIZJ = R.raw.icon_x_mark_fill_small;
                    c1251150ifB.LIZLLL = true;
                    c1251150ifB.LIZJ(new AwS571S0100000_27(this, 1234));
                    c0om1.LIZIZ(c1251150ifB);
                    tuxNavBar.setNavActions(c0om1);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, tuxNavBar.getContext());
                    if (numLIZJ != null) {
                        iIntValue2 = numLIZJ.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    tuxNavBar.setNavBackground(iIntValue2);
                } else {
                    C0OM1 c0om12 = new C0OM1();
                    C1251150ifB c1251150ifB2 = new C1251150ifB();
                    c1251150ifB2.LIZLLL();
                    c1251150ifB2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
                    c1251150ifB2.LIZLLL = true;
                    c1251150ifB2.LIZJ(new AwS571S0100000_27(this, 1235));
                    c0om12.LJ(c1251150ifB2);
                    C1250250idj c1250250idj2 = new C1250250idj();
                    c1250250idj2.LIZJ = getString(2131852996);
                    c0om12.LIZJ = c1250250idj2;
                    tuxNavBar.setNavActions(c0om12);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, tuxNavBar.getContext());
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    tuxNavBar.setNavBackground(iIntValue);
                    Integer num2 = this.LLJ;
                    if (num2 != null && num2.intValue() == 0) {
                        C1251150ifB c1251150ifB3 = new C1251150ifB();
                        c1251150ifB3.LIZLLL();
                        c1251150ifB3.LIZJ = R.raw.icon_question_mark_circle_ltr;
                        c1251150ifB3.LIZLLL = true;
                        c1251150ifB3.LIZJ(new AwS428S0200000_27(tuxNavBar, this, 86));
                        tuxNavBar.LIZ(c1251150ifB3);
                    }
                }
            } else {
                C339190DRl.LIZIZ(tuxNavBar);
            }
        }
        ?? r11 = 0;
        r11 = 0;
        this.LLJJJ = new C19319110i5(new C19319010i4("", z3, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, r11, r11, r11, 8, r11, false ? 1 : 0, false ? 1 : 0, 56312));
        Context context = getContext();
        if (context != null) {
            this.LLJLIL = new C1833370xoF(context, this.LLJJJ, this.LLJL);
            this.LLJLILLLLZIIL = new C1833430xoL(context, getView(), getChildFragmentManager(), this.LLJJJ, this.LLJL);
            this.LLJLL = new C1833420xoK(context, this, cS(), this.LLJL);
            this.LLJLLIL = new C1833360xoE(context, this, getActivity(), cS(), this.LLJL);
            C19319110i5 c19319110i5 = this.LLJJJ;
            LiveReplySettingViewModel liveReplySettingViewModelCS = cS();
            C1833560xoY c1833560xoY = this.LLJL;
            this.LLJLLL = new C1833410xoJ(context, this, c19319110i5, liveReplySettingViewModelCS, c1833560xoY);
            this.LLJZ = new C1833470xoP(context, this, c1833560xoY);
            this.LLJZIJLIL = new C1833440xoM(context, cS(), this.LLJL);
            this.LLL = new C1833460xoO(context, getView(), getChildFragmentManager(), cS(), this.LLJL);
            this.LLLF = new C1833380xoG(context, bS(), this.LLJI, this.LLJJJ, this.LLJJIJIIJIL, this, cS(), this.LLJL);
            this.LLLFF = new C1833450xoN(context, this, cS(), this.LLJL);
        }
        C1833410xoJ c1833410xoJ = this.LLJLLL;
        if (c1833410xoJ != null) {
            z2 = false;
            c1833410xoJ.LJI = new C19292910dr(new C19319810iC(false, c1833410xoJ.LIZ.getString(2131853000), null, false, null, null, null, c1833410xoJ.LIZ.getString(2131852997), false, false, false, null, 130037));
        }
        if (LiveReplayHighlightRecoverSetting.INSTANCE.enable() && (c1833430xoL = this.LLJLILLLLZIIL) != null) {
            String string9 = c1833430xoL.LIZ.getString(2131855671);
            Object[] objArr = new Object[1];
            objArr[z2 ? 1 : 0] = string9;
            String strLJIJJ = C497740JfY.LJIJJ(2131855670, objArr);
            C1864480ycQ c1864480ycQ = new C1864480ycQ(c1833430xoL, 2);
            if (strLJIJJ != null) {
                length = strLJIJJ.length();
            } else {
                length = 0;
            }
            if (string9 != null) {
                length2 = string9.length();
            } else {
                length2 = 0;
            }
            int i = length - length2;
            SpannableString spannableString = new SpannableString(strLJIJJ);
            C1119920fFW.LJ(c1833430xoL.LIZ, spannableString, z2 ? 1 : 0 ? 1 : 0, i, 17, 8, 400);
            C1119920fFW.LJ(c1833430xoL.LIZ, spannableString, i, spannableString.length(), 17, 8, 500);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.a1j, c1833430xoL.LIZ)), i, spannableString.length(), 17);
            C786410Ut5.p2(spannableString, c1864480ycQ, i, spannableString.length(), 17);
            r11 = 0;
            c1833430xoL.LJII = new C19292910dr(new C19319810iC(z2 ? 1 : 0, c1833430xoL.LIZ.getString(2131855672), null, z2 ? 1 : 0, null, null, null, null, z2 ? 1 : 0, z2 ? 1 : 0, z2 ? 1 : 0, spannableString, 98292));
        }
        C1833370xoF c1833370xoF = this.LLJLIL;
        if (c1833370xoF != null) {
            c1833370xoF.LJ = new C1238760iLC(new C19323610io(c1833370xoF.LIZ.getString(2131826538), r11, r11, r11, z2, r11, r11, r11, z2 ? 1 : 0, z2 ? 1 : 0, r11, c1833370xoF.LIZ.getString(2131826537), z2 ? 1 : 0, z2 ? 1 : 0, r11, r11, r11, 16771054));
        }
        C1833420xoK c1833420xoK = this.LLJLL;
        if (c1833420xoK != null) {
            String string10 = c1833420xoK.LIZ.getString(2131856104);
            String string11 = c1833420xoK.LIZ.getString(2131856103);
            z2 = z2 ? 1 : 0;
            c1833420xoK.LJFF = new C19292910dr(new C19319810iC(z2, string10, r11, z2, r11, r11, r11, string11, z2, z2, z2, r11, 130036));
        }
        C1833360xoE c1833360xoE = this.LLJLLIL;
        if (c1833360xoE != null) {
            c1833360xoE.LJI = new C1238760iLC(new C19323610io(c1833360xoE.LIZ.getString(2131856106), r11, r11, r11, z2, r11, r11, CardStruct.IStatusCode.DEFAULT, z2 ? 1 : 0, z2 ? 1 : 0, r11, c1833360xoE.LIZ.getString(2131856105), z2 ? 1 : 0, z2 ? 1 : 0, r11, r11, r11, 16772974));
        }
        C1833470xoP c1833470xoP = this.LLJZ;
        ?? r112 = r11;
        if (c1833470xoP != null) {
            String string12 = c1833470xoP.LIZ.getString(2131855307);
            ?? r113 = r11;
            boolean z4 = z2 ? 1 : 0;
            c1833470xoP.LJ = new C1238760iLC(new C19323610io(string12, r113, r113, r113, z4, r113, r113, r113, z4, z4, r113, r113, z4, z4, r113, r113, r113, 16775150));
            String string13 = c1833470xoP.LIZ.getString(2131855306);
            ?? r114 = r113;
            z2 = z4 ? 1 : 0;
            c1833470xoP.LJFF = new C1238760iLC(new C19323610io(string13, r114, r114, r114, z2, r114, r114, r114, z2, z2, r114, r114, z2, z2, r114, r114, r114, 16775150));
            c1833470xoP.LIZLLL = new C19319110i5(new C19319010i4("", z3, z2, z2, z2, r114, r114, r114, 8, r114, z2, z2 ? 1 : 0, 56312));
            r112 = r114;
        }
        C1833440xoM c1833440xoM = this.LLJZIJLIL;
        if (c1833440xoM != null) {
            String string14 = c1833440xoM.LIZ.getString(2131855305);
            String string15 = c1833440xoM.LIZ.getString(2131855304);
            z2 = z2 ? 1 : 0;
            c1833440xoM.LJ = new C19292910dr(new C19319810iC(z2, string14, r112, z2, r112, r112, r112, string15, z2, z2, z2, r112, 130037));
        }
        if (LiveUserPostHighlightSetting.INSTANCE.getValue() && (c1833460xoO = this.LLL) != null) {
            String string16 = c1833460xoO.LIZ.getString(2131856925);
            String string17 = c1833460xoO.LIZ.getString(2131856928);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string16);
            sbLIZ.append(' ');
            sbLIZ.append(string17);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            SpannableString spannableString2 = new SpannableString(strLIZIZ);
            C786410Ut5.p2(spannableString2, new C444920HcY(62, z2), string16.length() + 1, strLIZIZ.length(), 18);
            C786410Ut5.p2(spannableString2, new C1864480ycQ(c1833460xoO, 1), string16.length(), strLIZIZ.length(), 33);
            String string18 = c1833460xoO.LIZ.getString(2131856922);
            z2 = z2 ? 1 : 0;
            c1833460xoO.LJFF = new C19292910dr(new C19319810iC(z2, string18, r112, z2, r112, r112, r112, r112, z2, z2, z2, spannableString2, 98292));
        }
        C1833380xoG c1833380xoG = this.LLLF;
        ?? r115 = r112;
        if (c1833380xoG != null) {
            boolean z5 = z2;
            c1833380xoG.LJIIIIZZ = new C19292910dr(new C19319810iC(z5, C497740JfY.LJIJI(2131851331), new ACListenerS161S0100000_27(c1833380xoG, 162), z5, r112, r112, r112, r112, z5, z5, z5, C500260Jjc.LIZLLL(C497740JfY.LJIJI(2131851330), C497740JfY.LJIJI(2131856928), new C785810Us7(c1833380xoG, 7)), 97777));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" - ");
            sbLIZ2.append(C497740JfY.LJIJI(2131851329));
            ?? r116 = r112;
            c1833380xoG.LJIIIZ = new C1238760iLC(new C19323610io(C2188811AlT.LIZIZ(sbLIZ2), r116, new ACListenerS161S0100000_27(c1833380xoG, 163), r116, z5, r116, r116, r116, z5, z5, r116, r116, z5, z5, r116, r116, r116, 16775146));
            r115 = r116;
        }
        C1833450xoN c1833450xoN = this.LLLFF;
        if (c1833450xoN != null) {
            List<String> list = C1833580xoa.LIZ;
            if (Intrinsics.LJFF(null, Boolean.TRUE)) {
                c1833450xoN.LJ = c1833450xoN.LIZJ();
            }
        }
        C1833380xoG c1833380xoG2 = this.LLLF;
        if (c1833380xoG2 != null) {
            C19318810i2 c19318810i2BS = bS();
            C19292910dr c19292910dr = c1833380xoG2.LJIIIIZZ;
            if (c19292910dr != null) {
                c19318810i2BS.LIZ(c19292910dr);
            }
            C1238760iLC c1238760iLC = c1833380xoG2.LJIIIZ;
            if (c1238760iLC != null) {
                c19318810i2BS.LIZ(c1238760iLC);
            }
        }
        C1833410xoJ c1833410xoJ2 = this.LLJLLL;
        if (c1833410xoJ2 != null) {
            C19318810i2 c19318810i2BS2 = bS();
            C19292910dr c19292910dr2 = c1833410xoJ2.LJI;
            if (c19292910dr2 != null) {
                c19318810i2BS2.LIZ(c19292910dr2);
            }
        }
        C1833430xoL c1833430xoL2 = this.LLJLILLLLZIIL;
        if (c1833430xoL2 != null) {
            C19318810i2 c19318810i2BS3 = bS();
            C19292910dr c19292910dr3 = c1833430xoL2.LJII;
            if (c19292910dr3 != null) {
                c19318810i2BS3.LIZ(c19292910dr3);
            }
        }
        C1833370xoF c1833370xoF2 = this.LLJLIL;
        if (c1833370xoF2 != null) {
            C19318810i2 c19318810i2BS4 = bS();
            C1238760iLC c1238760iLC2 = c1833370xoF2.LJ;
            if (c1238760iLC2 != null) {
                c19318810i2BS4.LIZ(c1238760iLC2);
            }
        }
        C19319110i5 c19319110i52 = this.LLJJJ;
        if (c19319110i52 != null) {
            bS().LIZ(c19319110i52);
        }
        C1833450xoN c1833450xoN2 = this.LLLFF;
        if (c1833450xoN2 != null) {
            C19318810i2 c19318810i2BS5 = bS();
            C19292910dr c19292910dr4 = c1833450xoN2.LJ;
            if (c19292910dr4 != null) {
                c19318810i2BS5.LIZ(c19292910dr4);
            }
        }
        C1833420xoK c1833420xoK2 = this.LLJLL;
        if (c1833420xoK2 != null) {
            C19318810i2 c19318810i2BS6 = bS();
            C19292910dr c19292910dr5 = c1833420xoK2.LJFF;
            if (c19292910dr5 != null) {
                c19318810i2BS6.LIZ(c19292910dr5);
            }
        }
        C1833360xoE c1833360xoE2 = this.LLJLLIL;
        if (c1833360xoE2 != null) {
            C19318810i2 c19318810i2BS7 = bS();
            C1238760iLC c1238760iLC3 = c1833360xoE2.LJI;
            if (c1238760iLC3 != null) {
                c19318810i2BS7.LIZ(c1238760iLC3);
            }
        }
        C1833460xoO c1833460xoO2 = this.LLL;
        if (c1833460xoO2 != null) {
            C19318810i2 c19318810i2BS8 = bS();
            C19292910dr c19292910dr6 = c1833460xoO2.LJFF;
            if (c19292910dr6 != null) {
                c19318810i2BS8.LIZ(c19292910dr6);
            }
        }
        C1833470xoP c1833470xoP2 = this.LLJZ;
        if (c1833470xoP2 != null) {
            C19318810i2 c19318810i2BS9 = bS();
            C19319110i5 c19319110i53 = c1833470xoP2.LIZLLL;
            if (c19319110i53 != null) {
                c19318810i2BS9.LIZ(c19319110i53);
            }
            C1238760iLC c1238760iLC4 = c1833470xoP2.LJ;
            if (c1238760iLC4 != null) {
                c19318810i2BS9.LIZ(c1238760iLC4);
            }
            C1238760iLC c1238760iLC5 = c1833470xoP2.LJFF;
            if (c1238760iLC5 != null) {
                c19318810i2BS9.LIZ(c1238760iLC5);
            }
        }
        C1833440xoM c1833440xoM2 = this.LLJZIJLIL;
        if (c1833440xoM2 != null) {
            C19318810i2 c19318810i2BS10 = bS();
            C19292910dr c19292910dr7 = c1833440xoM2.LJ;
            if (c19292910dr7 != null) {
                c19318810i2BS10.LIZ(c19292910dr7);
            }
        }
        bS().LJ();
        dS();
        ?? r117 = r115;
        AssemViewModel.asyncSubscribe$default(cS(), new C2217381BqS() { // from class: X.0xMS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1816130xMR) obj).LL;
            }
        }, this, r117, new AwS606S0100000_27(this, 453), new AwS571S0100000_27(this, 1232), new AwS606S0100000_27(this, 454), 4, r117);
        ?? r118 = r117;
        AssemViewModel.selectSubscribe$default(cS(), new C2217381BqS() { // from class: X.0xMY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1816130xMR) obj).LLILZIL;
            }
        }, r117, this, r117, new AwS606S0100000_27(new AwS606S0100000_27(this, 455), 568), 10, r118);
        C1833420xoK c1833420xoK3 = this.LLJLL;
        ?? r119 = r118;
        if (c1833420xoK3 != null) {
            ?? r1110 = r118;
            AssemViewModel.asyncSubscribe$default(c1833420xoK3.LIZJ, new C2217381BqS() { // from class: X.0xMX
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1816130xMR) obj).LLILLL;
                }
            }, c1833420xoK3.LIZIZ, r118, new AwS606S0100000_27(c1833420xoK3, 516), r118, r1110, 52, r1110);
            r119 = r1110;
        }
        C1833360xoE c1833360xoE3 = this.LLJLLIL;
        ?? r1111 = r119;
        if (c1833360xoE3 != null) {
            ?? r9 = r119;
            ?? r10 = r119;
            ?? r1112 = r119;
            AssemViewModel.asyncSubscribe$default(c1833360xoE3.LIZLLL, new C2217381BqS() { // from class: X.0xMU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1816130xMR) obj).LLILZ;
                }
            }, c1833360xoE3.LIZIZ, r9, r10, r1112, new AwS606S0100000_27(c1833360xoE3, 505), 28, r1112);
            r1111 = r1112;
        }
        C1833410xoJ c1833410xoJ3 = this.LLJLLL;
        ?? r1113 = r1111;
        if (c1833410xoJ3 != null) {
            ?? r1114 = r1111;
            AssemViewModel.asyncSubscribe$default(c1833410xoJ3.LIZLLL, new C2217381BqS() { // from class: X.0xMZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1816130xMR) obj).LLILLJJLI;
                }
            }, c1833410xoJ3.LIZIZ, r1114, new AwS606S0100000_27(c1833410xoJ3, 511), new AwS571S0100000_27(c1833410xoJ3, 1289), new AwS591S0100000_12(c1833410xoJ3, 1021), 4, r1114);
            r1113 = r1114;
        }
        C1833380xoG c1833380xoG3 = this.LLLF;
        if (c1833380xoG3 != null) {
            ?? r6 = r1113;
            ?? r1115 = r1113;
            AssemViewModel.asyncSubscribe$default(c1833380xoG3.LJI, new C2217381BqS() { // from class: X.0xMW
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1816130xMR) obj).LLIZ;
                }
            }, c1833380xoG3.LJFF, r6, new AwS606S0100000_27(c1833380xoG3, 514), new AwS571S0100000_27(c1833380xoG3, 1290), new AwS606S0100000_27(c1833380xoG3, 518), 4, r1115);
            AssemViewModel.asyncSubscribe$default(c1833380xoG3.LJI, new C2217381BqS() { // from class: X.0xMT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1816130xMR) obj).LLIZLLLIL;
                }
            }, c1833380xoG3.LJFF, r1115, new AwS606S0100000_27(c1833380xoG3, 503), new AwS571S0100000_27(c1833380xoG3, 1287), new AwS606S0100000_27(c1833380xoG3, 508), 4, r1115);
            AssemViewModel.asyncSubscribe$default(c1833380xoG3.LJI, new C2217381BqS() { // from class: X.0xMV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1816130xMR) obj).LLJ;
                }
            }, c1833380xoG3.LJFF, null, null, AFwS216S0000000_27.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), new AwS606S0100000_27(c1833380xoG3, 512), 12, null);
        }
    }

    public LiveReplaySettingPageFragment(Integer num, Boolean bool, String str, String str2, String str3, int i) {
        num = (i & 1) != 0 ? 0 : num;
        bool = (i & 2) != 0 ? null : bool;
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        this.LLJ = num;
        this.LLJI = bool;
        this.LLJIJIL = str;
        this.LLJILJIL = str2;
        this.LLJILJILJ = str3;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1238));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveReplySettingViewModel.class);
        this.LLJJJIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 338), new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 1237), AFwS269S0000000_27.get$arr$(402));
        this.LLJJL = true;
        this.LLJJLIIIJLLLLLLLZ = true;
    }
}
