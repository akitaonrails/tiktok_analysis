package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C01GW;
import X.C06MM;
import X.C1097400efC;
import X.C1103300eoi;
import X.C1107060eum;
import X.C1143680frq;
import X.C1147800fyU;
import X.C1161920gLG;
import X.C12973055v;
import X.C1338270kvh;
import X.C13LE;
import X.C1440005kM;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C16F5;
import X.C1782040wTS;
import X.C1782060wTU;
import X.C1782070wTV;
import X.C1784870wY1;
import X.C1822330xWR;
import X.C1822730xX5;
import X.C1822770xX9;
import X.C1822780xXA;
import X.C1822790xXB;
import X.C1822890xXL;
import X.C1822910xXN;
import X.C1822950xXR;
import X.C1823060xXc;
import X.C1823340xY4;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C21578619ce;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C421850GgR;
import X.C425101l3;
import X.C452501pT;
import X.C464660IKa;
import X.C490590JLt;
import X.C500260Jjc;
import X.C504210Jpz;
import X.C518280KUg;
import X.C520040KaQ;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C930940aKi;
import X.EnumC1123040fKY;
import X.EnumC1420700n4e;
import X.EnumC993080bww;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1822470xWf;
import X.InterfaceC1822900xXM;
import X.InterfaceC2217461Bqa;
import X.InterfaceC495470Jbt;
import X.RunnableC421830GgP;
import X.RunnableC781530UlD;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsDmPreloadLayoutOptSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServicePlusSingleSkuEnableSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioContentAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceBioContentAssem extends UISlotAssem implements PcsServiceBioContentAbility {
    public static final C421850GgR LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final int LLLII;
    public final AssemVMLazy LLJJI;
    public C1822330xWR LLJJIII;
    public ViewGroup LLJJIJI;
    public C1822910xXN LLJJIJIIJIL;
    public RunnableC781530UlD LLJJIJIL;
    public C1147800fyU LLJJJ;
    public ViewGroup LLJJJIL;
    public LiveIconView LLJJJJ;
    public C16F5 LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public ViewGroup LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public C21578619ce LLJLL;
    public ViewGroup LLJLLIL;
    public ValueAnimator LLJLLL;
    public ValueAnimator LLJZ;
    public ValueAnimator LLJZIJLIL;
    public final RunnableC421830GgP LLL;
    public final BPEAHandler LLLF;
    public int LLLFF;
    public final C01GW LLLFFI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0GgR] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceBioContentAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/viewmodel/PcsServiceBioVM;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFZ = new Object() { // from class: X.0GgR
        };
        LLLII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0GgP] */
    public PcsServiceBioContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12973055v(c19719912DlLIZ), new C1823340xY4(), null, true);
        this.LLL = new Runnable() { // from class: X.0GgP
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                ValueAnimator valueAnimator;
                C1C7U.LIZ("PcsServiceBioContentAssem@92e2.scrollStopRunnable$1");
                try {
                    PcsServiceBioContentAssem pcsServiceBioContentAssem = this.LL;
                    ViewGroup viewGroup = pcsServiceBioContentAssem.LLJJJJLIIL;
                    if (viewGroup != null && (((valueAnimator = pcsServiceBioContentAssem.LLJZIJLIL) == null || !valueAnimator.isRunning()) && viewGroup.getTranslationY() != 0.0f)) {
                        ValueAnimator valueAnimator2 = pcsServiceBioContentAssem.LLJZIJLIL;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(viewGroup.getHeight(), 0.0f);
                        valueAnimatorOfFloat.setDuration(100L);
                        valueAnimatorOfFloat.setStartDelay(0L);
                        valueAnimatorOfFloat.addUpdateListener(new C420000GdS(viewGroup));
                        valueAnimatorOfFloat.start();
                        pcsServiceBioContentAssem.LLJZIJLIL = valueAnimatorOfFloat;
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsServiceBioContentAssem@92e2.scrollStopRunnable$1");
            }
        };
        this.LLLF = new BPEAHandler(Looper.getMainLooper());
        this.LLLFF = -1;
        this.LLLFFI = C452501pT.LIZIZ(new C1823060xXc(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyz;
    }

    public final C1822330xWR hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1822330xWR.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C1822330xWR) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final PcsServiceBioVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        return (PcsServiceBioVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioContentAbility
    public final void lo0() {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            Integer num = ip().LLILZIL;
            if (num != null) {
                layoutParams.height = num.intValue();
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLLF.removeCallbacks(this.LLL);
        if (!LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue()) {
            C1822780xXA c1822780xXA = ip().LLJIJIL;
            InterfaceC1822470xWf interfaceC1822470xWf = c1822780xXA.LIZJ;
            if (interfaceC1822470xWf != null) {
                interfaceC1822470xWf.LLLILZ();
            }
            C1822790xXB[] c1822790xXBArr = c1822780xXA.LIZIZ;
            for (C1822790xXB c1822790xXB : c1822790xXBArr) {
                c1822790xXB.LIZ();
            }
            C1822770xX9 c1822770xX9 = ip().LLJILJIL;
            if (c1822770xX9.LJFF) {
                c1822770xX9.LIZJ.LIZJ(c1822770xX9.LJI);
            } else {
                c1822770xX9.LIZ();
            }
            InterfaceC495470Jbt interfaceC495470Jbt = c1822770xX9.LIZLLL;
            if (interfaceC495470Jbt != null) {
                ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Bc1(interfaceC495470Jbt);
            }
        }
        C1147800fyU c1147800fyU = this.LLJJJ;
        if (c1147800fyU != null) {
            C1097400efC.LIZJ(c1147800fyU);
        }
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), PcsServiceBioContentAbility.class, null);
    }

    public final void yp() {
        ip();
        Pair pairDQ2 = PcsServiceBioVM.DQ2(this, ip().LLJI);
        boolean zBooleanValue = ((Boolean) pairDQ2.getFirst()).booleanValue();
        pairDQ2.getSecond();
        if (!zBooleanValue) {
            ViewGroup viewGroup = this.LLJJIJI;
            if (viewGroup != null) {
                C500260Jjc.LJIILIIL(viewGroup);
            }
            ViewGroup viewGroup2 = this.LLJLLIL;
            if (viewGroup2 != null) {
                C500260Jjc.LJIILIIL(viewGroup2);
            }
            C20441214yg.LIZIZ("PcsServiceBioContentAssem", "multi sku container hide content");
            return;
        }
        ip().LLJJ = this;
        if (LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue()) {
            PcsServiceBioAbility pcsServiceBioAbility = (PcsServiceBioAbility) this.LLLFFI.getValue();
            if (pcsServiceBioAbility != null) {
                pcsServiceBioAbility.kY(3);
            }
        } else {
            PcsServiceBioAbility pcsServiceBioAbility2 = (PcsServiceBioAbility) this.LLLFFI.getValue();
            if (pcsServiceBioAbility2 != null) {
                pcsServiceBioAbility2.kY(0);
            }
        }
        ViewGroup viewGroup3 = this.LLJJIJI;
        if (viewGroup3 != null) {
            C500260Jjc.LLFFF(viewGroup3);
        }
        C1822330xWR c1822330xWRHp = hp();
        if (c1822330xWRHp == null || !c1822330xWRHp.LLILZIL) {
            ViewGroup viewGroup4 = this.LLJLLIL;
            if (viewGroup4 != null) {
                C500260Jjc.LJIILIIL(viewGroup4);
            }
        } else {
            ViewGroup viewGroup5 = this.LLJLLIL;
            if (viewGroup5 != null) {
                C500260Jjc.LLFFF(viewGroup5);
            }
        }
        C723850SaN.LIZLLL(this, new C1822890xXL(this));
        C20441214yg.LIZIZ("PcsServiceBioContentAssem", "multi sku container show content");
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Context contextLJIIIIZZ;
        if (!C504210Jpz.LIZ && !C464660IKa.LIZ()) {
            super.Eo(context);
            return context;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null) {
            return contextLJIIIIZZ;
        }
        return context;
    }

    public final void lp(String str) {
        C1822330xWR c1822330xWRHp = hp();
        if (c1822330xWRHp != null && c1822330xWRHp.LIZ()) {
            View view = this.LLJL;
            if (view != null) {
                C500260Jjc.LJIILIIL(view);
                return;
            }
            return;
        }
        C1143680frq.LJ(this.LLJL, "tiktok_live_subscription_demand_1", str, ImageView.ScaleType.FIT_XY);
    }

    public final void mp(String str) {
        C1784870wY1 c1784870wY1;
        SMBPreviewResponse.ResponseData responseData;
        List<SMBCourse> list;
        String str2;
        C1822330xWR c1822330xWRHp = hp();
        int size = 0;
        if (c1822330xWRHp != null && c1822330xWRHp.LLILZ) {
            C1822330xWR c1822330xWRHp2 = hp();
            if (c1822330xWRHp2 == null || (str2 = c1822330xWRHp2.LLJ) == null) {
                str2 = "";
            }
            C1822730xX5.LIZJ(hp(), str2, ip().CQ2());
        } else if (!ip().CQ2()) {
            C1822730xX5.LIZIZ(new C1822950xXR("show", null, null, null, null, null, null, hp(), 126));
        }
        if (!ip().CQ2()) {
            ip().GQ2(str, ip().LLIZLLLIL);
        }
        if (hp() != null && (!r0.LLILZ)) {
            C1103300eoi c1103300eoi = C1103300eoi.LIZLLL;
            C1822330xWR c1822330xWRHp3 = hp();
            if (c1822330xWRHp3 != null && (c1784870wY1 = c1822330xWRHp3.LLILZLL) != null && (responseData = c1784870wY1.LIZJ) != null && (list = responseData.courseList) != null) {
                size = list.size();
            }
            c1103300eoi.LIZLLL(1, "smb_viewer_service_bio_open_count");
            c1103300eoi.LJI("smb_viewer_service_bio_course_count", Integer.valueOf(size));
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0204  */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0xX7] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(X.C1784870wY1 r13) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem.sp(X.0wY1):void");
    }

    public final void tp(boolean z) {
        float f;
        float alpha;
        Float f2;
        final ViewGroup viewGroup = this.LLJLIL;
        if (viewGroup != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator valueAnimator = this.LLJLLL;
            if ((valueAnimator != null && valueAnimator.isRunning()) || viewGroup.getAlpha() == f) {
                return;
            }
            ValueAnimator valueAnimator2 = this.LLJLLL;
            Object animatedValue = null;
            if (valueAnimator2 != null) {
                animatedValue = valueAnimator2.getAnimatedValue();
            }
            if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
                alpha = f2.floatValue();
            } else {
                alpha = viewGroup.getAlpha();
            }
            ValueAnimator valueAnimator3 = this.LLJLLL;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.setStartDelay(0L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0GUh
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    C786410Ut5.T4(viewGroup, ((Float) valueAnimator4.getAnimatedValue()).floatValue());
                }
            });
            valueAnimatorOfFloat.start();
            this.LLJLLL = valueAnimatorOfFloat;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void kp(InterfaceC1822900xXM interfaceC1822900xXM, EnumC1420700n4e enumC1420700n4e) {
        C1782070wTV c1782070wTV;
        String str;
        String strLIZ;
        Window window;
        C1782040wTS c1782040wTS;
        C1782060wTU c1782060wTU;
        String key = interfaceC1822900xXM.getKey();
        String str2 = null;
        switch (key.hashCode()) {
            case -1499838031:
                if (!key.equals("direct_message")) {
                    return;
                }
                op(getContext(), interfaceC1822900xXM.getSchema());
                C1822330xWR c1822330xWRHp = hp();
                if (c1822330xWRHp != null) {
                    str2 = c1822330xWRHp.LLILLJJLI;
                }
                up(String.valueOf(str2), EnumC1123040fKY.DM);
                C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_dm_click_count_live_session");
                C1822730xX5.LIZIZ(new C1822950xXR("click", "dm", null, null, null, null, enumC1420700n4e, hp(), 60));
                break;
                break;
            case -1354571749:
                if (!key.equals("course")) {
                    return;
                }
                if ((interfaceC1822900xXM instanceof C1782070wTV) && (c1782070wTV = (C1782070wTV) interfaceC1822900xXM) != null) {
                    C1822730xX5.LIZIZ(new C1822950xXR("click", "course", Long.valueOf(c1782070wTV.LJIIIZ), null, null, null, enumC1420700n4e, hp(), 56));
                    C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_course_unpaid_video_click_count");
                    Pair[] pairArr = new Pair[2];
                    C1822330xWR c1822330xWRHp2 = hp();
                    String str3 = "";
                    if (c1822330xWRHp2 == null || (str = c1822330xWRHp2.LL) == null) {
                        str = "";
                    }
                    pairArr[0] = new Pair("show_entrance", str);
                    pairArr[1] = new Pair("enter_from", "service_plus_pannel");
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    C490590JLt c490590JLt = C490590JLt.LIZ;
                    String str4 = c1782070wTV.LJFF;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    c490590JLt.getClass();
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(getContext(), C490590JLt.LIZIZ(str3, mapLJIIIIZZ), new Bundle());
                }
                break;
                break;
            case -1116288512:
                if (!key.equals("fill_form")) {
                    return;
                }
                Context context = getContext();
                String schema = interfaceC1822900xXM.getSchema();
                Activity activityLIZ = C06MM.LIZ(context);
                if (activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
                    window.setSoftInputMode(16);
                }
                if (schema != null) {
                    C490590JLt.LIZ.getClass();
                    strLIZ = C425101l3.LIZ(C490590JLt.LIZLLL(schema), new C518280KUg(this));
                } else {
                    strLIZ = null;
                }
                ip().LLJILJIL.LIZIZ(strLIZ, false, ip().LLIZLLLIL, 0, hp());
                if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, strLIZ);
                } else {
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, strLIZ, new Bundle());
                }
                C1822330xWR c1822330xWRHp3 = hp();
                if (c1822330xWRHp3 != null) {
                    str2 = c1822330xWRHp3.LLILLJJLI;
                }
                up(String.valueOf(str2), EnumC1123040fKY.FORM);
                C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_form_click_count_live_session");
                C1822730xX5.LIZIZ(new C1822950xXR("click", "form", null, null, interfaceC1822900xXM.LIZIZ(), null, enumC1420700n4e, hp(), 44));
                break;
                break;
            case -262183029:
                if (!key.equals("third_party_link")) {
                    return;
                }
                if ((interfaceC1822900xXM instanceof C1782040wTS) && (c1782040wTS = (C1782040wTS) interfaceC1822900xXM) != null) {
                    C1822730xX5.LIZIZ(new C1822950xXR("click", "third_party_service", null, null, null, null, enumC1420700n4e, hp(), 60));
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(getContext(), c1782040wTS.LJFF, new Bundle());
                }
                break;
                break;
            case 1448769636:
                if (!key.equals("booking_calendar")) {
                    return;
                }
                if ((interfaceC1822900xXM instanceof C1782060wTU) && (c1782060wTU = (C1782060wTU) interfaceC1822900xXM) != null) {
                    C1822730xX5.LIZIZ(new C1822950xXR("click", "calendly", null, null, null, c1782060wTU.LIZ, enumC1420700n4e, hp(), 28));
                    C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_calendar_click_count");
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(getContext(), c1782060wTU.LJ, new Bundle());
                }
                break;
                break;
            default:
                return;
        }
        C1440005kM.LIZ(new IEvent() { // from class: X.0KWr
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

    public final void op(Context context, String str) {
        String str2;
        C490590JLt c490590JLt = C490590JLt.LIZ;
        String str3 = "";
        if (str == null) {
            str = "";
        }
        Map<String, String> mapVQ2 = ip().vQ2(false, ip().LLIZLLLIL);
        c490590JLt.getClass();
        String strLIZ = C490590JLt.LIZ(str, "biz_event_tracking_extra", mapVQ2);
        if (LivePcsDmPreloadLayoutOptSetting.INSTANCE.enable()) {
            strLIZ = C490590JLt.LIZIZ(strLIZ, C2097908Jt.LIZJ(new Pair("allow_preload_layout", "1")));
        }
        C1822780xXA c1822780xXA = ip().LLJIJIL;
        boolean z = ip().LLIZLLLIL;
        C1822330xWR c1822330xWRHp = hp();
        if (c1822330xWRHp != null && (str2 = c1822330xWRHp.LL) != null) {
            str3 = str2;
        }
        c1822780xXA.LIZ(strLIZ, false, z, 0, str3, hp());
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, strLIZ, new Bundle());
        C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_dm_click_count_live_session");
    }

    public final void up(String str, EnumC1123040fKY enumC1123040fKY) {
        if (str.length() != 0) {
            C1822330xWR c1822330xWRHp = hp();
            if (c1822330xWRHp != null && c1822330xWRHp.LLILZ) {
                return;
            }
            EnumC993080bww enumC993080bww = EnumC993080bww.CLICK;
            C1107060eum.LIZ(str, enumC1123040fKY.getValue(), enumC993080bww.getValue(), (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class), 0);
        }
    }
}
