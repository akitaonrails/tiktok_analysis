package com.ss.android.ugc.aweme.tako.multiconversation.sug;

import X.C019F;
import X.C01GW;
import X.C0DSB;
import X.C0GWH;
import X.C0Q4Y;
import X.C13LE;
import X.C1637806bA;
import X.C1858020yS0;
import X.C1858070yS5;
import X.C1858430ySf;
import X.C1858440ySg;
import X.C1858480ySk;
import X.C1858500ySm;
import X.C1858540ySq;
import X.C1863130yaF;
import X.C1864530ycV;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C416320GUc;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1858470ySj;
import X.EnumC2012407uU;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC1864720yco;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC1864650ych;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS75S0200000_6;
import Y.AUListenerS148S0300000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugListCardAssem;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMiddlePageSugListCardAssem extends ReusedUISlotAssem<TakoMiddlePageSugListCardAssem> implements InterfaceC712990Rxx<C1858020yS0> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZ;
    public static final PathInterpolator LLLILZJ;
    public View LLJJLIIIJLLLLLLLZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJL;
    public TuxTextView LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public FrameLayout LLJLLIL;
    public View LLJLLL;
    public SmartImageView LLJZ;
    public LinearLayoutCompat LLJZIJLIL;
    public SmartImageView LLL;
    public C0GWH LLLF;
    public C0GWH LLLFF;
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 834));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 832));
    public final AssemVMLazy LLLI;
    public boolean LLLII;
    public ARunnableS75S0200000_6 LLLIIII;
    public ValueAnimator LLLIIIIL;
    public ARunnableS106S0100000_6 LLLIIIL;
    public final ViewOnLayoutChangeListenerC1864650ych LLLIIL;
    public final ViewOnLayoutChangeListenerC1864650ych LLLIILIL;
    public boolean LLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMiddlePageSugListCardAssem.class, "messageModel", "getMessageModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLILZJ = new PathInterpolator(0.2f, 0.8f, 0.2f, 1.0f);
    }

    public TakoMiddlePageSugListCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        this.LLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS571S0100000_27(c19719912DlLIZ, 833), AFwS269S0000000_27.get$arr$(247), null, true);
        this.LLLIIL = new ViewOnLayoutChangeListenerC1864650ych(this, 5);
        this.LLLIILIL = new ViewOnLayoutChangeListenerC1864650ych(this, 4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fn6;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void op() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        TuxTextView tuxTextView = this.LLJLIL;
        int i2 = 8388611;
        if (tuxTextView != null && (tuxTextView.getGravity() & 7) == 1) {
            i2 = 1;
        }
        LinearLayoutCompat linearLayoutCompat = this.LLJZIJLIL;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setGravity(i2 | 16);
        }
        C0GWH c0gwh = this.LLLF;
        ViewGroup.LayoutParams layoutParams2 = c0gwh != null ? c0gwh.getLayoutParams() : null;
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null || layoutParams.gravity == (i = i2 | 16)) {
            return;
        }
        layoutParams.gravity = i;
        C0GWH c0gwh2 = this.LLLF;
        if (c0gwh2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gwh2);
            c0gwh2.setLayoutParams(layoutParams);
        }
    }

    public final void tp() {
        C1858540ySq.LIZ.getClass();
        if (((Boolean) C1858540ySq.LIZIZ.getValue()).booleanValue()) {
            TakoEnterParams takoEnterParams = yp().LLILLL;
            if (takoEnterParams != null) {
                String str = takoEnterParams.enterFrom;
                if (str == null) {
                    str = "";
                }
                if (Intrinsics.LJFF(str, "notification_page_tikbot") && (!((ArrayList) yp().sL()).isEmpty())) {
                    C1858440ySg.LIZ(true, true);
                    LinearLayoutCompat linearLayoutCompat = this.LLJZIJLIL;
                    if (linearLayoutCompat != null) {
                        C786410Ut5.LLILLIZIL(linearLayoutCompat, 8);
                        return;
                    }
                    return;
                }
            }
            C1858440ySg.LIZ(false, false);
            LinearLayoutCompat linearLayoutCompat2 = this.LLJZIJLIL;
            if (linearLayoutCompat2 != null) {
                C786410Ut5.LLILLIZIL(linearLayoutCompat2, 0);
            }
        }
    }

    public final MessageViewModel yp() {
        AssemVMLazy assemVMLazy = this.LLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZ;
        return (MessageViewModel) assemVMLazy.getValue();
    }

    public final C1858430ySf zp() {
        C1858430ySf c1858430ySf = C1858440ySg.LIZ;
        return c1858430ySf == null ? C1858430ySf.LJIIIZ : c1858430ySf;
    }

    public final void Bp() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (zp().LIZ) {
            LinearLayoutCompat linearLayoutCompat = this.LLJZIJLIL;
            if (linearLayoutCompat != null && (viewPropertyAnimatorAnimate = linearLayoutCompat.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            LinearLayoutCompat linearLayoutCompat2 = this.LLJZIJLIL;
            if (linearLayoutCompat2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayoutCompat2);
                linearLayoutCompat2.setAlpha(1.0f);
            }
            LinearLayoutCompat linearLayoutCompat3 = this.LLJZIJLIL;
            if (linearLayoutCompat3 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayoutCompat3);
                linearLayoutCompat3.setTranslationY(0.0f);
            }
            LinearLayoutCompat linearLayoutCompat4 = this.LLJZIJLIL;
            if (linearLayoutCompat4 != null) {
                HandlerHook.viewRemoveCallbacks(linearLayoutCompat4, this.LLLIIIL);
            }
            this.LLLIIIL = null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        View view;
        if (zp().LIZ) {
            Bp();
            C416320GUc.LIZ = 0;
            ValueAnimator valueAnimator = this.LLLIIIIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LLLIIIIL = null;
            ARunnableS75S0200000_6 aRunnableS75S0200000_6 = this.LLLIIII;
            if (aRunnableS75S0200000_6 != null && (view = this.LLJJLIIIJLLLLLLLZ) != null) {
                HandlerHook.viewRemoveCallbacks(view, aRunnableS75S0200000_6);
            }
            this.LLLIIII = null;
            this.LLLII = false;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM;
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.dz0);
        this.LLJL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.wnm);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.tv_sug_title);
        this.LLJLILLLLZIIL = (FrameLayout) view.findViewById(R.id.iaa);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.tv_sub_second_line_title);
        this.LLJLLIL = (FrameLayout) view.findViewById(R.id.ia_);
        this.LLJLLL = view.findViewById(R.id.lwg);
        this.LLJZ = (SmartImageView) view.findViewById(R.id.lwf);
        this.LLJZIJLIL = (LinearLayoutCompat) view.findViewById(R.id.nig);
        this.LLL = (SmartImageView) view.findViewById(R.id.nif);
        this.LLLF = (C0GWH) view.findViewById(R.id.tv_sug_title_skeleton);
        this.LLLFF = (C0GWH) view.findViewById(R.id.tv_sug_sub_title_skeleton);
        tp();
        if (zp().LIZIZ) {
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLLFZ.getValue();
            if (takoChatUIAbility != null) {
                viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM();
            } else {
                viewOnAttachStateChangeListenerC20604515jvCM = null;
            }
            View view2 = this.LLJJLIIIJLLLLLLLZ;
            if (view2 != null) {
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1864720yco(viewOnAttachStateChangeListenerC20604515jvCM, this, 6));
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoMiddlePageSugItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1864530ycV(this, 8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0171  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1858020yS0 r15) {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugListCardAssem.up(java.lang.Object):void");
    }

    public final void up(C1858020yS0 c1858020yS0) {
        boolean z;
        String string;
        ViewGroup.LayoutParams layoutParams;
        int iLIZIZ;
        int iLIZIZ2;
        int i;
        int i2;
        Context context;
        String str;
        ViewGroup.LayoutParams layoutParams2;
        int iLIZIZ3;
        int iLIZIZ4;
        Bp();
        if (zp().LIZLLL == EnumC2012407uU.OLD_STYLE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LinearLayoutCompat linearLayoutCompat = this.LLJZIJLIL;
            if (linearLayoutCompat != null) {
                C1858500ySm.LIZ.getClass();
                if (((Boolean) C1858500ySm.LIZIZ.getValue()).booleanValue() && !zp().LIZ) {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                } else {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
                Integer numValueOf = Integer.valueOf(iLIZIZ3);
                if (zp().LIZ()) {
                    iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                } else if (zp().LIZJ == EnumC1858470ySj.GREY_SINGLE_LINE) {
                    iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                } else {
                    iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                }
                C426750GoL.LJIIIZ(linearLayoutCompat, null, numValueOf, null, Integer.valueOf(iLIZIZ4), false, 21);
                ViewGroup.LayoutParams layoutParams3 = linearLayoutCompat.getLayoutParams();
                layoutParams3.width = -1;
                layoutParams3.height = -2;
            }
            C1863130yaF.LIZ.getClass();
            if (!C1863130yaF.LIZ() && !zp().LIZ) {
                i = -1;
            } else {
                i = -2;
            }
            FrameLayout frameLayout = this.LLJLILLLLZIIL;
            if (frameLayout != null && (layoutParams2 = frameLayout.getLayoutParams()) != null && layoutParams2.width != i) {
                layoutParams2.width = i;
                C786410Ut5.a6(frameLayout, layoutParams2);
            }
            TuxTextView tuxTextView = this.LLJLIL;
            String string2 = null;
            if (tuxTextView != null) {
                ViewGroup.LayoutParams layoutParams4 = tuxTextView.getLayoutParams();
                layoutParams4.width = i;
                layoutParams4.height = -2;
                if (!C1863130yaF.LIZ() && !zp().LIZ) {
                    i2 = 17;
                } else {
                    i2 = 8388611;
                }
                tuxTextView.setGravity(i2);
                if (C1863130yaF.LIZ()) {
                    tuxTextView.setTuxFont(32);
                    tuxTextView.setTextColorRes(R.attr.a1i);
                } else {
                    sp(tuxTextView, zp().LIZJ);
                }
                String string3 = c1858020yS0.LLILLJJLI.sugTitle;
                if ((string3 == null || !(true ^ a0.LJJJIL(string3))) && ((context = getContext()) == null || (string3 = context.getString(2131822432)) == null)) {
                    string3 = "";
                }
                if (zp().LIZ && !C1863130yaF.LIZ() && (zp().LIZJ != EnumC1858470ySj.BLACK_DOUBLE_LINE ? (str = zp().LJII.titleSingleLine) != null : (str = zp().LJII.titleDoubleLineMainTitle) != null)) {
                    string3 = str;
                }
                tuxTextView.setText(string3);
            }
            TuxTextView tuxTextView2 = this.LLJLL;
            if (tuxTextView2 != null) {
                if (zp().LIZ()) {
                    FrameLayout frameLayout2 = this.LLJLLIL;
                    if (frameLayout2 != null) {
                        C0DSB.LIZJ(frameLayout2);
                    }
                    C0DSB.LIZJ(tuxTextView2);
                    tuxTextView2.setGravity(8388611);
                    String str2 = zp().LJII.titleDoubleLineSubTitle;
                    if (str2 == null) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            string2 = context2.getString(2131822515);
                        }
                        str2 = string2;
                    }
                    tuxTextView2.setText(str2);
                    sp(tuxTextView2, zp().LIZJ);
                } else {
                    FrameLayout frameLayout3 = this.LLJLLIL;
                    if (frameLayout3 != null) {
                        C0DSB.LIZIZ(frameLayout3);
                    }
                    C0DSB.LIZIZ(tuxTextView2);
                }
            }
            LinearLayoutCompat linearLayoutCompat2 = this.LLJZIJLIL;
            if (linearLayoutCompat2 != null && zp().LJI) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayoutCompat2);
                linearLayoutCompat2.setAlpha(0.0f);
                ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6((Object) linearLayoutCompat2, 242);
                this.LLLIIIL = aRunnableS106S0100000_6;
                HandlerHook.viewPostDelay(linearLayoutCompat2, aRunnableS106S0100000_6, 100L);
            }
            op();
            return;
        }
        LinearLayoutCompat linearLayoutCompat3 = this.LLJZIJLIL;
        if (linearLayoutCompat3 != null) {
            if (C1858070yS5.LIZ(c1858020yS0.LLILLJJLI) == null) {
                C1858500ySm.LIZ.getClass();
                if (((Boolean) C1858500ySm.LIZIZ.getValue()).booleanValue()) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
                C426750GoL.LJIIIZ(linearLayoutCompat3, null, Integer.valueOf(iLIZIZ2), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), false, 21);
                C426750GoL.LJIIL(linearLayoutCompat3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 26);
            } else {
                C1858500ySm.LIZ.getClass();
                if (((Boolean) C1858500ySm.LIZIZ.getValue()).booleanValue()) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                C426750GoL.LJIIIZ(linearLayoutCompat3, null, Integer.valueOf(iLIZIZ), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 21);
                C426750GoL.LJIIL(linearLayoutCompat3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, 26);
            }
        }
        FrameLayout frameLayout4 = this.LLJLILLLLZIIL;
        if (frameLayout4 != null && (layoutParams = frameLayout4.getLayoutParams()) != null && layoutParams.width != -2) {
            layoutParams.width = -2;
            C786410Ut5.a6(frameLayout4, layoutParams);
        }
        FrameLayout frameLayout5 = this.LLJLLIL;
        if (frameLayout5 != null) {
            C0DSB.LIZIZ(frameLayout5);
        }
        TuxTextView tuxTextView3 = this.LLJLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setGravity(8388611);
            if (C1858070yS5.LIZ(c1858020yS0.LLILLJJLI) == null) {
                string = tuxTextView3.getContext().getString(2131822432);
            } else {
                string = tuxTextView3.getContext().getString(2131822431);
            }
            tuxTextView3.setText(string);
        }
        op();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1858020yS0 c1858020yS0) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1858020yS0 c1858020yS0) {
    }

    public static void Ap(C0GWH c0gwh, TuxTextView tuxTextView) {
        int lineHeight;
        ViewGroup.LayoutParams layoutParams;
        if (c0gwh != null && tuxTextView != null && (lineHeight = tuxTextView.getLineHeight()) > 0 && (layoutParams = c0gwh.getLayoutParams()) != null && layoutParams.height != lineHeight) {
            layoutParams.height = lineHeight;
            C786410Ut5.W5(c0gwh, layoutParams);
        }
    }

    public static void sp(TuxTextView tuxTextView, EnumC1858470ySj enumC1858470ySj) {
        int i = C1858480ySk.LIZ[enumC1858470ySj.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        tuxTextView.setTuxFont(12);
                        tuxTextView.setTextColorRes(R.attr.a1h);
                        return;
                    }
                    throw new C1954807lC();
                }
                tuxTextView.setTuxFont(22);
                tuxTextView.setTextColorRes(R.attr.a1h);
                return;
            }
            tuxTextView.setTuxFont(32);
            tuxTextView.setTextColorRes(R.attr.a1h);
            return;
        }
        tuxTextView.setTuxFont(52);
        tuxTextView.setTextColorRes(R.attr.a1k);
    }

    public final void Ep(final boolean z, final boolean z2) {
        final View view = this.LLJJLIIIJLLLLLLLZ;
        if (view == null) {
            return;
        }
        if (!this.LLLII) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0Ghn
            public final void LIZ() {
                int height;
                ViewGroup.MarginLayoutParams marginLayoutParams;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM;
                TakoMiddlePageSugListCardAssem takoMiddlePageSugListCardAssem = this.LL;
                View view2 = view;
                TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) takoMiddlePageSugListCardAssem.LLLFZ.getValue();
                if (takoChatUIAbility == null || (viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM()) == null || (height = viewOnAttachStateChangeListenerC20604515jvCM.getHeight() - view2.getHeight()) < 0) {
                    height = 0;
                }
                TakoMiddlePageSugListCardAssem takoMiddlePageSugListCardAssem2 = this.LL;
                boolean z3 = z && takoMiddlePageSugListCardAssem2.LLLII;
                View view3 = takoMiddlePageSugListCardAssem2.LLJJLIIIJLLLLLLLZ;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        ValueAnimator valueAnimator = takoMiddlePageSugListCardAssem2.LLLIIIIL;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (z3) {
                            int i = marginLayoutParams.topMargin;
                            if (i != height) {
                                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, height);
                                valueAnimatorOfInt.setDuration(260L);
                                valueAnimatorOfInt.setInterpolator(TakoMiddlePageSugListCardAssem.LLLILZJ);
                                valueAnimatorOfInt.addUpdateListener(new AUListenerS148S0300000_6(takoMiddlePageSugListCardAssem2, marginLayoutParams, view3, 5));
                                valueAnimatorOfInt.start();
                                takoMiddlePageSugListCardAssem2.LLLIIIIL = valueAnimatorOfInt;
                            }
                        } else {
                            if (marginLayoutParams.topMargin != height) {
                                marginLayoutParams.topMargin = height;
                            }
                            C786410Ut5.W5(view3, marginLayoutParams);
                        }
                    }
                }
                TakoMiddlePageSugListCardAssem takoMiddlePageSugListCardAssem3 = this.LL;
                if (takoMiddlePageSugListCardAssem3.LLLII || !z2) {
                    return;
                }
                View view4 = view;
                ARunnableS75S0200000_6 aRunnableS75S0200000_6 = takoMiddlePageSugListCardAssem3.LLLIIII;
                if (aRunnableS75S0200000_6 != null) {
                    HandlerHook.viewRemoveCallbacks(view4, aRunnableS75S0200000_6);
                }
                ARunnableS75S0200000_6 aRunnableS75S0200000_62 = new ARunnableS75S0200000_6(takoMiddlePageSugListCardAssem3, view4, 111);
                takoMiddlePageSugListCardAssem3.LLLIIII = aRunnableS75S0200000_62;
                HandlerHook.viewPostDelay(view4, aRunnableS75S0200000_62, 50L);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TakoMiddlePageSugListCardAssem@54f6.updateSugContainerForKeyboard$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TakoMiddlePageSugListCardAssem@54f6.updateSugContainerForKeyboard$1");
            }
        });
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
