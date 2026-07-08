package com.ss.android.ugc.aweme.im.sdk.chat.ui.interraction;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C0I0B;
import X.C0I6Y;
import X.C0VSJ;
import X.C0Z2Z;
import X.C0ZDX;
import X.C0ZO1;
import X.C0ZO2;
import X.C0ZO3;
import X.C0ZO4;
import X.C0ZO5;
import X.C0ZO7;
import X.C0ZP4;
import X.C1294120jmU;
import X.C1322110kVd;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C315420CYa;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C461530I7z;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C898460ZMm;
import X.C898510ZMr;
import X.C898520ZMs;
import X.C898840ZNy;
import X.C898900ZOe;
import X.C913770Zt1;
import X.EnumC461660I8m;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.InterfaceC898830ZNx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS149S0100000_14;
import Y.AObserverS218S0100000_14;
import Y.ARunnableS114S0100000_14;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel;
import com.ss.android.ugc.aweme.im.message.template.card.InteractionCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.FortuneCookieInfoComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.interraction.InteractionCardReusedUISlot;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes15.dex */
public final class InteractionCardReusedUISlot extends ReusedUISlotAssem<InteractionCardReusedUISlot> implements InterfaceC712990Rxx<InterfaceC898830ZNx>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJL;
    public C0ZP4 LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final MutableLiveData<C0ZO4> LLLF;
    public final C0ZO7 LLLFF;
    public final C913770Zt1 LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InteractionCardReusedUISlot.class, "interactionCardViewModel", "getInteractionCardViewModel()Lcom/ss/android/ugc/aweme/im/interactioncard/viewmodel/InteractionCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0ZO7] */
    public InteractionCardReusedUISlot() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InteractionCardViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 828), AFwS248S0000000_14.get$arr$(237), null, true);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 827));
        this.LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 829));
        this.LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 825));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 830));
        this.LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 826));
        this.LLLF = new MutableLiveData<>(C0ZO5.LIZ);
        this.LLLFF = new AlphaPlayerAction() { // from class: X.0ZO7
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void endAction() {
                String str;
                this.LIZ.getClass();
                C0ZO4 value = this.LIZ.LLLF.getValue();
                C0ZO0 c0zo0 = value instanceof C0ZO0 ? (C0ZO0) value : null;
                C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(this.LIZ));
                if (!Intrinsics.LJFF(c869590Y9lLIZ.getLocalExt().get("fortune_cookie_animated"), "1")) {
                    c869590Y9lLIZ.getLocalExt().put("fortune_cookie_animated", "1");
                    C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9lLIZ, "fortune_cookie_animated", new C0Y3R("1"), new C0Y3I("FortuneCookie message update fortune_cookie_animated"));
                }
                C337180DJs.LIZJ(this.LIZ.yp());
                if (c0zo0 == null || (str = c0zo0.LIZJ) == null) {
                    return;
                }
                InteractionCardReusedUISlot interactionCardReusedUISlot = this.LIZ;
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
                c1331670kl3LJII.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJII.LJJ(interactionCardReusedUISlot.yp());
                c1331670kl3LJII.LJIIJ(interactionCardReusedUISlot.LLLFFI);
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void startAction() {
                HandlerHook.viewPostDelay(this.LIZ.tp(), new ARunnableS114S0100000_14(this.LIZ, 19), 100L);
                C337180DJs.LIZJ(this.LIZ.Ap());
                C786410Ut5.B5(this.LIZ.Ap(), 0.0f);
                q0.LIZIZ(this.LIZ.Ap()).LIZIZ();
                C19WF c19wfLIZIZ = q0.LIZIZ(this.LIZ.Ap());
                c19wfLIZIZ.LIZJ(1000L);
                View view = c19wfLIZIZ.LIZ.get();
                if (view != null) {
                    view.animate().setStartDelay(500L);
                }
                c19wfLIZIZ.LIZLLL(new LinearInterpolator());
                c19wfLIZIZ.LIZ(1.0f);
                c19wfLIZIZ.LJFF();
            }
        };
        this.LLLFFI = new C913770Zt1(this, 1);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.clf;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TuxTextView Ap() {
        return (TuxTextView) this.LLJLLL.getValue();
    }

    public final C1294120jmU Bp() {
        return (C1294120jmU) this.LLJZIJLIL.getValue();
    }

    public final SmartImageView tp() {
        return (SmartImageView) this.LLJZ.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLJLILLLLZIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C0ZP4 c0zp4 = this.LLJLIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        Bp().LIZIZ();
        this.LLJLL = false;
    }

    public final SmartImageView yp() {
        return (SmartImageView) this.LLL.getValue();
    }

    public final InteractionCardViewModel zp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        return (InteractionCardViewModel) assemVMLazy.getValue();
    }

    public static String up(InteractionCardReusedUISlot interactionCardReusedUISlot) {
        Object obj;
        String str;
        FortuneCookieInfoComponent fortuneCookieInfoComponent;
        C724270Sb3 c724270Sb3 = interactionCardReusedUISlot.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        InteractionCardTemplate interactionCardTemplate = (InteractionCardTemplate) C0Z2Z.LIZ(C0I6Y.LIZ((InterfaceC461380I7k) obj), InteractionCardTemplate.class);
        Context context = interactionCardReusedUISlot.Ap().getContext();
        if (interactionCardTemplate == null || (fortuneCookieInfoComponent = interactionCardTemplate.fortuneCookieInfoComponent) == null || (str = fortuneCookieInfoComponent.messageTips) == null) {
            str = "";
        }
        int iN3 = C786410Ut5.n3(context.getResources(), str, "string", context.getPackageName());
        if (iN3 == 0) {
            iN3 = R.string.dm_fortuneCookie_001;
        }
        return context.getString(iN3);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 28), LJJIJL());
        if (((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL == EnumC461660I8m.END) {
            AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(236);
            View view2 = (View) this.LLJLLIL.getValue();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                aFwS248S0000000_14.invoke(layoutParams);
                C786410Ut5.W5(view2, layoutParams);
                TuxTextView tuxTextViewAp = Ap();
                ViewGroup.LayoutParams layoutParams2 = tuxTextViewAp.getLayoutParams();
                if (layoutParams2 != null) {
                    aFwS248S0000000_14.invoke(layoutParams2);
                    C786410Ut5.W5(tuxTextViewAp, layoutParams2);
                    SmartImageView smartImageViewTp = tp();
                    ViewGroup.LayoutParams layoutParams3 = smartImageViewTp.getLayoutParams();
                    if (layoutParams3 != null) {
                        aFwS248S0000000_14.invoke(layoutParams3);
                        C786410Ut5.W5(smartImageViewTp, layoutParams3);
                        C1294120jmU c1294120jmUBp = Bp();
                        ViewGroup.LayoutParams layoutParams4 = c1294120jmUBp.getLayoutParams();
                        if (layoutParams4 != null) {
                            aFwS248S0000000_14.invoke(layoutParams4);
                            C786410Ut5.W5(c1294120jmUBp, layoutParams4);
                            SmartImageView smartImageViewYp = yp();
                            ViewGroup.LayoutParams layoutParams5 = smartImageViewYp.getLayoutParams();
                            if (layoutParams5 != null) {
                                aFwS248S0000000_14.invoke(layoutParams5);
                                C786410Ut5.W5(smartImageViewYp, layoutParams5);
                                View view3 = (View) this.LLJLLIL.getValue();
                                ViewGroup.LayoutParams layoutParams6 = view3.getLayoutParams();
                                if (layoutParams6 != null) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6;
                                    marginLayoutParams.setMarginStart(0);
                                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                                    C786410Ut5.W5(view3, marginLayoutParams);
                                    SmartImageView smartImageViewTp2 = tp();
                                    ViewGroup.LayoutParams layoutParams7 = smartImageViewTp2.getLayoutParams();
                                    if (layoutParams7 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams7;
                                        marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                                        marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
                                        C786410Ut5.W5(smartImageViewTp2, marginLayoutParams2);
                                        Ap().setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                                        View viewLJJIJL = LJJIJL();
                                        ViewGroup.LayoutParams layoutParams8 = viewLJJIJL.getLayoutParams();
                                        if (layoutParams8 != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams8;
                                            marginLayoutParams3.setMarginEnd(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
                                            C786410Ut5.W5(viewLJJIJL, marginLayoutParams3);
                                            View view4 = ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLJJLI;
                                            if (view4 != null) {
                                                ViewGroup.LayoutParams layoutParams9 = view4.getLayoutParams();
                                                if (layoutParams9 != null) {
                                                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams9;
                                                    marginLayoutParams4.setMarginStart(0);
                                                    C786410Ut5.W5(view4, marginLayoutParams4);
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                }
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else {
            View viewLJJIJL2 = LJJIJL();
            ViewGroup.LayoutParams layoutParams10 = viewLJJIJL2.getLayoutParams();
            if (layoutParams10 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams10;
                marginLayoutParams5.setMarginStart(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
                C786410Ut5.W5(viewLJJIJL2, marginLayoutParams5);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJIILL();
        ((C1322110kVd) this.LLJLLIL.getValue()).setActualImageResource(R.drawable.cc2);
        if (C426750GoL.LIZLLL(LJJIJL().getContext())) {
            C786410Ut5.Jb(tp(), 180.0f);
            C1294120jmU c1294120jmUBp2 = Bp();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1294120jmUBp2);
            c1294120jmUBp2.setRotationY(180.0f);
            C786410Ut5.Jb(yp(), 180.0f);
        }
        Transformations.distinctUntilChanged(this.LLLF).observe(this, new AObserverS218S0100000_14(this, 3));
    }

    public final void op(C898520ZMs c898520ZMs) {
        Object obj;
        Object obj2;
        C0ZO3 c0zo3;
        FortuneCookieInfoComponent fortuneCookieInfoComponent;
        Object obj3;
        InteractionCardViewModel interactionCardViewModelZp = zp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) obj);
        if (interactionCardViewModelZp.LLILZIL.add(c869590Y9lLIZ.getUuid())) {
            boolean zLIZ = C898460ZMm.LIZ(c869590Y9lLIZ);
            boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9lLIZ);
            String strValueOf = String.valueOf(c869590Y9lLIZ.getSender());
            C0I0B.LJFF.LIZIZ();
            Pair[] pairArr = new Pair[3];
            String str = CardStruct.IStatusCode.DEFAULT;
            if (zLIZ) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("is_open", obj3);
            if (zLJJJJIZL) {
                str = "1";
            }
            pairArr[1] = new Pair("is_self", str);
            pairArr[2] = new Pair("from_user_id", strValueOf);
            C20684815ws.LJIILLIIL("fortune_cookie_show", C2097608Jq.LJIIIIZZ(pairArr));
        }
        String str2 = c898520ZMs.LIZ;
        String str3 = c898520ZMs.LIZIZ;
        String str4 = c898520ZMs.LIZJ;
        if (str2 != null && str3 != null && str4 != null) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            C869590Y9l c869590Y9lLIZ2 = C0I6Y.LIZ((InterfaceC461380I7k) obj2);
            InteractionCardTemplate interactionCardTemplate = (InteractionCardTemplate) C0Z2Z.LIZ(c869590Y9lLIZ2, InteractionCardTemplate.class);
            if (interactionCardTemplate != null && (fortuneCookieInfoComponent = interactionCardTemplate.fortuneCookieInfoComponent) != null && fortuneCookieInfoComponent.show) {
                if (Intrinsics.LJFF(c869590Y9lLIZ2.getLocalExt().get("fortune_cookie_animated"), "1")) {
                    c0zo3 = C0ZO3.LLILLL;
                } else {
                    c0zo3 = C0ZO3.LLILLJJLI;
                }
            } else {
                c0zo3 = C0ZO3.LL;
            }
            int iOrdinal = c0zo3.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        this.LLLF.setValue(new C0ZO1(up(this), str4));
                        return;
                    }
                    throw new C1954807lC();
                }
                AnonymousClass0956 anonymousClass0956 = this.LLJLILLLLZIIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                InteractionCardViewModel interactionCardViewModelZp2 = zp();
                AwS128S1100000_14 awS128S1100000_14 = new AwS128S1100000_14(this, str4, 7);
                AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(new DataSource.DataInfo(new C0VSJ(str3, "output.mp4").getAbsolutePath()), 1);
                C0VSJ c0vsj = new C0VSJ(str3, "config.json");
                Object obj4 = ((LinkedHashMap) interactionCardViewModelZp2.LL).get(c0vsj.getAbsolutePath());
                if (obj4 != null) {
                    awS128S1100000_14.invoke(awS593S0100000_14.invoke(obj4));
                } else {
                    anonymousClass0956LIZLLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(interactionCardViewModelZp2), null, null, new C315420CYa(c0vsj, awS128S1100000_14, interactionCardViewModelZp2, awS593S0100000_14, null), 3);
                }
                this.LLJLILLLLZIIL = anonymousClass0956LIZLLL;
                return;
            }
            this.LLLF.setValue(new C0ZO2(str2));
            return;
        }
        this.LLLF.setValue(C0ZO5.LIZ);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC898830ZNx interfaceC898830ZNx) {
        InterfaceC898830ZNx interfaceC898830ZNx2 = interfaceC898830ZNx;
        zp().wQ2(interfaceC898830ZNx2.LLILII().LIZ.LIZ);
        this.LLLF.setValue(C0ZO5.LIZ);
        sp(interfaceC898830ZNx2);
    }

    public final void sp(InterfaceC898830ZNx interfaceC898830ZNx) {
        C898520ZMs c898520ZMs;
        C869590Y9l c869590Y9l = interfaceC898830ZNx.LLILII().LIZ.LIZ;
        C898510ZMr c898510ZMr = zp().getState().LLILLJJLI;
        if (c898510ZMr != null) {
            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                c898520ZMs = c898510ZMr.LIZIZ;
            } else {
                c898520ZMs = c898510ZMr.LIZ;
            }
            op(c898520ZMs);
        }
        C0ZP4 c0zp4 = this.LLJLIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJLIL = C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.0ZNz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C898480ZMo) obj).LLILLJJLI;
            }
        }, null, new AwS628S0100000_14(c869590Y9l, 25), 6);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC898830ZNx interfaceC898830ZNx) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC898830ZNx interfaceC898830ZNx) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C898840ZNy c898840ZNy;
        InterfaceC898830ZNx interfaceC898830ZNx = (InterfaceC898830ZNx) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            zp().wQ2(C0I6Y.LIZ(interfaceC898830ZNx));
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C898840ZNy) && (c898840ZNy = (C898840ZNy) obj2) != null && c898840ZNy.LIZ) {
                    sp(interfaceC898830ZNx);
                }
            }
            return;
        }
        zp().wQ2(interfaceC898830ZNx.LLILII().LIZ.LIZ);
        this.LLLF.setValue(C0ZO5.LIZ);
        sp(interfaceC898830ZNx);
    }
}
