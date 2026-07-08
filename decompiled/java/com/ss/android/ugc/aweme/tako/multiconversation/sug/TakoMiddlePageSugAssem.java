package com.ss.android.ugc.aweme.tako.multiconversation.sug;

import X.C01GW;
import X.C0GWH;
import X.C13LC;
import X.C14J2;
import X.C1818207Ae;
import X.C1856450yPT;
import X.C1858040yS2;
import X.C1858070yS5;
import X.C1858080yS6;
import X.C1858430ySf;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1864200yby;
import X.C20235214Fq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC2012407uU;
import X.EnumC993120bx0;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC1864720yco;
import X.ViewTreeObserverOnPreDrawListenerC1858400ySc;
import Y.ARunnableS75S0200000_6;
import Y.ATListenerS459S0100000_27;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.experiment.TakoMiddlePageSugClickInterceptExperiment;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import wh6.AbS512S0200000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMiddlePageSugAssem extends ReusedUISlotAssem<TakoMiddlePageSugAssem> implements InterfaceC712990Rxx<C1858040yS2> {
    public static final DecelerateInterpolator LLLIIII = new DecelerateInterpolator();
    public C1858040yS2 LLJLIL;
    public View LLJLILLLLZIIL;
    public C0GWH LLJLL;
    public TuxIconView LLJLLIL;
    public C14J2 LLJLLL;
    public ARunnableS75S0200000_6 LLJZIJLIL;
    public Map<String, String> LLL;
    public long LLLF;
    public long LLLFF;
    public long LLLFFI;
    public int LLLFZ;
    public boolean LLLI;
    public ViewTreeObserverOnPreDrawListenerC1858400ySc LLLII;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 831));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 830));
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(182));

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C1858430ySf tp() {
        return (C1858430ySf) this.LLJZ.getValue();
    }

    public final ITakoContextAbility up() {
        return (ITakoContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return tp().LIZLLL == EnumC2012407uU.OLD_STYLE ? tp().LIZ ? R.layout.fl4 : R.layout.fl3 : R.layout.fl2;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        if (tp().LJI) {
            yp();
        }
    }

    public final Map op() {
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityUp = up();
        String str = (iTakoContextAbilityUp == null || (c13lcT71 = iTakoContextAbilityUp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) ? null : c1863850ybP.LLILZIL;
        String str2 = (str == null || a0.LJJJIL(str) || !Intrinsics.LJFF(C1858080yS6.LIZIZ, str)) ? CardStruct.IStatusCode.DEFAULT : "1";
        ITakoContextAbility iTakoContextAbilityUp2 = up();
        if (iTakoContextAbilityUp2 == null || (c13lcAp0 = iTakoContextAbilityUp2.Ap0()) == null || (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) == null) {
            return C2097908Jt.LIZJ(new Pair("first_enter", str2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = c1864200yby.LLILLJJLI;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("session_source", str3);
        linkedHashMap.put("first_enter", str2);
        return linkedHashMap;
    }

    public final void yp() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (tp().LJI) {
            C14J2 c14j2 = this.LLJLLL;
            if (c14j2 != null && (viewPropertyAnimatorAnimate = c14j2.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            C14J2 c14j22 = this.LLJLLL;
            if (c14j22 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c14j22);
                c14j22.setAlpha(1.0f);
            }
            C14J2 c14j23 = this.LLJLLL;
            if (c14j23 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c14j23);
                c14j23.setTranslationY(0.0f);
            }
            C14J2 c14j24 = this.LLJLLL;
            if (c14j24 != null) {
                HandlerHook.viewRemoveCallbacks(c14j24, this.LLJZIJLIL);
            }
            this.LLJZIJLIL = null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) throws JSONException {
        C14J2 c14j2;
        Map<String, String> commonParams;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i;
        int i2;
        this.LLJLILLLLZIIL = view.findViewById(R.id.wnf);
        this.LLJLL = (C0GWH) view.findViewById(R.id.wnl);
        this.LLJLLIL = (TuxIconView) view.findViewById(R.id.jx0);
        C14J2 c14j22 = (C14J2) view.findViewById(R.id.ety);
        this.LLJLLL = c14j22;
        if (c14j22 != null) {
            C427690Gpr.LJ(c14j22, C418440Gaw.LIZIZ(16));
        }
        C1858430ySf c1858430ySfTp = tp();
        if (c1858430ySfTp.LIZLLL == EnumC2012407uU.OLD_STYLE) {
            C14J2 c14j23 = this.LLJLLL;
            if (c14j23 != null) {
                c14j23.setUI(new AwS606S0100000_27(this, 530));
            }
            if (c1858430ySfTp.LIZ) {
                C14J2 c14j24 = this.LLJLLL;
                if (c14j24 != null) {
                    ViewGroup.LayoutParams layoutParams3 = c14j24.getLayoutParams();
                    if (layoutParams3 != null) {
                        if (c1858430ySfTp.LIZIZ()) {
                            i2 = -2;
                        } else {
                            i2 = -1;
                        }
                        layoutParams3.width = i2;
                        layoutParams3.height = -2;
                        C786410Ut5.W5(c14j24, layoutParams3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                View view2 = this.LLJLILLLLZIIL;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                    if (layoutParams4 != null) {
                        if (c1858430ySfTp.LIZIZ()) {
                            i = -2;
                        } else {
                            i = 0;
                        }
                        layoutParams4.width = i;
                        layoutParams4.height = -2;
                        C786410Ut5.W5(view2, layoutParams4);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (c1858430ySfTp.LJ == EnumC993120bx0.WRAP_CONTENT_LOW) {
                    TuxIconView tuxIconView = this.LLJLLIL;
                    if (tuxIconView != null && (layoutParams2 = tuxIconView.getLayoutParams()) != null) {
                        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    }
                } else {
                    TuxIconView tuxIconView2 = this.LLJLLIL;
                    if (tuxIconView2 != null && (layoutParams = tuxIconView2.getLayoutParams()) != null) {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    }
                }
            }
        } else {
            C14J2 c14j25 = this.LLJLLL;
            if (c14j25 != null) {
                c14j25.setUI(new AwS606S0100000_27(this, 531));
            }
        }
        if ((((Number) C1818207Ae.LIZ.getValue()).intValue() == 0 || ((TakoMiddlePageSugClickInterceptExperiment.Config) TakoMiddlePageSugClickInterceptExperiment.LIZIZ.getValue()).enable == 1) && (c14j2 = this.LLJLLL) != null) {
            c14j2.setOnTouchListener(new ATListenerS459S0100000_27(this, 5));
        }
        C14J2 c14j26 = this.LLJLLL;
        if (c14j26 != null) {
            C786410Ut5.I7(new AbS512S0200000_27(this, c14j26, 1), c14j26);
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL.isAttachedToWindow()) {
            this.LLLF = System.currentTimeMillis();
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Map<String, String> map = this.LLL;
            ITakoContextAbility iTakoContextAbilityUp = up();
            if (iTakoContextAbilityUp != null) {
                commonParams = iTakoContextAbilityUp.getCommonParams();
            } else {
                commonParams = null;
            }
            c1862330yYx.mobTikbotQuickInteractionShow(map, commonParams);
        } else {
            viewLJJIJL.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1864720yco(viewLJJIJL, this, 2));
        }
        C2211631BhB.LJ(getContentView(), new AwS606S0100000_27(this, 529));
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0242  */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0ySc, android.view.ViewTreeObserver$OnPreDrawListener] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1858040yS2 r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugAssem.up(java.lang.Object):void");
    }

    public final Map<String, String> sp(C1856450yPT c1856450yPT) {
        TakoSug takoSug;
        String str;
        String str2;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        if (c1856450yPT != null && (takoSug = c1856450yPT.LLILLJJLI) != null && takoSug.isFirstSug) {
            ITakoContextAbility iTakoContextAbilityUp = up();
            if (iTakoContextAbilityUp != null && (c13lcT71 = iTakoContextAbilityUp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                str = c1863850ybP.LLILZIL;
            } else {
                str = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C20235214Fq.LIZ.getClass();
            String strLIZJ = C20235214Fq.LIZJ(str);
            String str3 = "";
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            linkedHashMap.put("group_id", strLIZJ);
            String strLIZLLL = C20235214Fq.LIZLLL(str);
            if (strLIZLLL != null) {
                str3 = strLIZLLL;
            }
            linkedHashMap.put("last_feed_group_id", str3);
            if (C1858070yS5.LIZ(c1856450yPT.LLILLJJLI) != null) {
                str2 = "after_feed";
            } else {
                str2 = "general_sug";
            }
            linkedHashMap.put("page_type", str2);
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1858040yS2 c1858040yS2) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1858040yS2 c1858040yS2) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws JSONException {
        up(interfaceC1587906Jp);
    }
}
