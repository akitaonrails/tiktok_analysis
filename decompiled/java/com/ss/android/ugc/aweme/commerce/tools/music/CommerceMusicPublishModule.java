package com.ss.android.ugc.aweme.commerce.tools.music;

import X.C013C;
import X.C01GW;
import X.C09R3;
import X.C1001130c9v;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397720mTa;
import X.C13LE;
import X.C13LZ;
import X.C15MY;
import X.C1848410yCV;
import X.C20506715Mb;
import X.C20507015Me;
import X.C20507115Mf;
import X.C20507215Mg;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C424470Gkf;
import X.C452501pT;
import X.C786410Ut5;
import X.C985403tE;
import X.C997320c3m;
import X.EnumC746940TRs;
import X.InterfaceC1065900dqO;
import X.InterfaceC20506815Mc;
import X.InterfaceC20507515Mj;
import X.InterfaceC20507615Mk;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS210S0100000_6;
import Y.AObserverS233S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.tools.music.viewmodel.CommerceMusicLegalViewModel;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS110S0400000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import mf.a;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceMusicPublishModule implements InterfaceC20506815Mc {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C15MY LL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS276S0000000_31.get$arr$(59));
    public final C997320c3m LLILLL = new C997320c3m(AFwS276S0000000_31.get$arr$(60));
    public final C997320c3m LLILZ = new C997320c3m(AFwS276S0000000_31.get$arr$(58));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS432S0200000_31(this, new AwS575S0100000_31(this, 340), 39));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceMusicPublishModule.class, "fragment", "getFragment()Landroidx/fragment/app/Fragment;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommerceMusicPublishModule.class, "isKccNoticeShow", "isKccNoticeShow()Z", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommerceMusicPublishModule.class, "commerceModel", "getCommerceModel()Lcom/ss/android/ugc/aweme/commerce/tools/common/CommerceToolsModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC856520Xis
    public final void IS() {
    }

    @Override // X.InterfaceC856250XiR
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        ((InterfaceC1065900dqO) Mh()).LJIIIZ(this);
        ((InterfaceC20507615Mk) Mh()).getLifecycleOwner().getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC20506815Mc, X.InterfaceC1057310dcX
    public final void onCreate() {
        C20506715Mb.onCreate(this);
        ((CommerceMusicLegalViewModel) this.LLILZIL.getValue()).LLIZLLLIL.observe(this.LL.getLifecycleOwner(), new AObserverS233S0100000_31(this, 9));
        ((LiveData) ((CommerceMusicLegalViewModel) this.LLILZIL.getValue()).LLILZLL.getValue()).observe(this.LL.getLifecycleOwner(), new AObserverS233S0100000_31(this, 10));
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    @Override // X.InterfaceC20506815Mc, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C20506715Mb.onDestroy(this);
    }

    @Override // X.InterfaceC20506815Mc, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C20506715Mb.onPause(this);
    }

    @Override // X.InterfaceC20506815Mc, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C20506715Mb.onResume(this);
    }

    @Override // X.InterfaceC20506815Mc, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C20506715Mb.onStart(this);
    }

    @Override // X.InterfaceC20506815Mc, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C20506715Mb.onStop(this);
    }

    public CommerceMusicPublishModule(C15MY c15my) {
        this.LL = c15my;
    }

    @Override // X.InterfaceC856520Xis
    public final boolean np0(InterfaceC20507515Mj interfaceC20507515Mj) {
        Context contextLIZIZ;
        CommerceMusicLegalViewModel commerceMusicLegalViewModel = (CommerceMusicLegalViewModel) this.LLILZIL.getValue();
        if (((ICommerceCommonService) ServiceManager.get().getService(ICommerceCommonService.class)).LIZLLL()) {
            contextLIZIZ = C1001130c9v.LIZ(this);
        } else {
            contextLIZIZ = C1001130c9v.LIZIZ(this);
        }
        C20507115Mf c20507115Mf = new C20507115Mf(interfaceC20507515Mj);
        C20507215Mg c20507215Mg = new C20507215Mg(interfaceC20507515Mj);
        if (!Intrinsics.LJFF(((LiveData) commerceMusicLegalViewModel.LLJ.getValue()).getValue(), Boolean.FALSE)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            Boolean value = commerceMusicLegalViewModel.LLIZLLLIL.getValue();
            Boolean bool = Boolean.TRUE;
            c2344009Gk.LJ(Boolean.valueOf(Intrinsics.LJFF(value, bool)), "checked");
            C20684815ws.LJIILLIIL("ba_click_post_with_ugc", c2344009Gk.LIZ);
            if (Intrinsics.LJFF(commerceMusicLegalViewModel.LLIZLLLIL.getValue(), bool)) {
                C20684815ws.LJIILLIIL("ba_publish_with_ugc", C2097908Jt.LIZJ(new Pair("source", EnumC746940TRs.POST_PAGE.getValue())));
            } else {
                C20684815ws.LJIILLIIL("ba_click_post_without_confirmation_reminder", C2097908Jt.LIZJ(new Pair("page", EnumC746940TRs.DIALOG.getValue())));
                if (contextLIZIZ != null) {
                    C013C c013c = new C013C();
                    C1397580mTM c1397580mTM = new C1397580mTM(contextLIZIZ);
                    c1397580mTM.LJFF(2131821340);
                    c1397580mTM.LIZ(2131821337);
                    C1397720mTa.LIZ(c1397580mTM, contextLIZIZ.getString(2131821339), new AwS605S0100000_26(contextLIZIZ, 654));
                    C985403tE.LIZ(c1397580mTM, new AwS110S0400000_12(c013c, commerceMusicLegalViewModel, c20507115Mf, c20507215Mg, 4));
                    c1397580mTM.LIZJ(new AwS610S0100000_31(c20507215Mg, 433));
                    c1397580mTM.LIZLLL(new AwS378S0200000_12(c013c, c20507215Mg, 85));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
                interfaceC20507515Mj.getIntercepted();
                return true;
            }
        }
        interfaceC20507515Mj.LIZ();
        return false;
    }

    @Override // X.InterfaceC856250XiR
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        final int iIntValue;
        C20507015Me c20507015Me = new C20507015Me((ViewStub) view.findViewById(R.id.oxd));
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        Fragment fragment = (Fragment) c997320c3m.LIZ(this);
        CommerceMusicLegalViewModel commerceMusicLegalViewModel = (CommerceMusicLegalViewModel) this.LLILZIL.getValue();
        boolean zBooleanValue = ((Boolean) this.LLILLL.LIZ(this)).booleanValue();
        C424470Gkf c424470Gkf = c20507015Me.LIZ;
        if (c424470Gkf != null) {
            ((LiveData) commerceMusicLegalViewModel.LLJ.getValue()).observe(fragment, new AObserverS210S0100000_6(c424470Gkf, 40));
            commerceMusicLegalViewModel.LLIZLLLIL.observe(fragment, new AObserverS210S0100000_6(c424470Gkf, 41));
            if (zBooleanValue) {
                c424470Gkf.getMusicUsageTextViewFromXml().setTuxFont(81);
            }
            TuxTextView musicUsageTextViewFromXml = c424470Gkf.getMusicUsageTextViewFromXml();
            String string2 = c424470Gkf.getResources().getString(2131844980);
            String string3 = c424470Gkf.getResources().getString(2131844981);
            Locale locale = Locale.ROOT;
            if (a0.LJJIIZI(string2, string3.toLowerCase(locale), false)) {
                string = u.LJJIFFI(string2, string3.toLowerCase(locale), string3, false);
            } else {
                string = c424470Gkf.getResources().getString(2131844980, string3);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iLJJJ = a0.LJJJ(string, string3, 0, false, 6);
            int iLJ = C13LZ.LJ(iLJJJ, 0, string.length() - 1);
            int iLJ2 = C13LZ.LJ(iLJJJ + string3.length(), 0, string.length());
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c424470Gkf.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan(iIntValue) { // from class: X.0TRt
                public final int LL;

                {
                    this.LL = iIntValue;
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view2) {
                    if (view2 instanceof TextView) {
                        ((TextView) view2).setHighlightColor(0);
                    }
                    C0TS9.LIZ(view2.getContext(), "post_page");
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(this.LL);
                    textPaint.setUnderlineText(false);
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(82);
                    textPaint.setTypeface(c444890HcV.getTypeface());
                }
            }, iLJ, iLJ2, 18);
            musicUsageTextViewFromXml.setText(spannableStringBuilder);
            c424470Gkf.getMusicUsageTextViewFromXml().setMovementMethod(LinkMovementMethod.getInstance());
            c424470Gkf.getMusicUsageTextViewFromXml().setHighlightColor(0);
            c424470Gkf.getConfirmUsageCheckBoxFromXml().setClickable(false);
            View.OnClickListener aCListenerS147S0100000_12 = new ACListenerS147S0100000_12(commerceMusicLegalViewModel, 376);
            if (C1848410yCV.LIZ) {
                aCListenerS147S0100000_12 = new f(aCListenerS147S0100000_12);
            }
            a aVar = new a(aCListenerS147S0100000_12);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c424470Gkf);
            }
            c424470Gkf.setOnClickListener(aVar);
        }
    }
}
