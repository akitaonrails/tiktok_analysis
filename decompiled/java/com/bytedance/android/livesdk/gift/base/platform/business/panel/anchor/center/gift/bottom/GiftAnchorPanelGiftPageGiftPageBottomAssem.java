package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom;

import X.AnonymousClass0956;
import X.C0IJT;
import X.C1117830fC9;
import X.C1125820fP2;
import X.C1125860fP6;
import X.C1125920fPC;
import X.C1133640fbe;
import X.C1145120fuA;
import X.C1146120fvm;
import X.C1146350fw9;
import X.C1161920gLG;
import X.C13LP;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C19ME;
import X.C23250099c;
import X.C474500IjA;
import X.C495520Jby;
import X.C497740JfY;
import X.C500260Jjc;
import X.C723590SZx;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import Y.AAListenerS139S0300000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.text.Layout;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator;
import com.bytedance.android.livesdk.gift.model.GiftsInfoByCreator;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftAnchorListCacheSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelGiftPageGiftPageBottomAssem extends UISlotAssem implements IGiftAnchorPanelGiftPageBottomAbility, InterfaceC1554640qYg {
    public View LLJJIII;
    public ImageView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public ImageView LLJJJJJIL;
    public ImageView LLJJJJLIIL;
    public View LLJJL;
    public ImageView LLJJLIIIJLLLLLLLZ;
    public TextView LLJL;
    public boolean LLJLLIL;
    public AnonymousClass0956 LLJLLL;
    public boolean LLJZ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1146120fvm.class, null), checkSupervisorPrepared());
    public final LinearInterpolator LLJLIL = new LinearInterpolator();
    public final AccelerateDecelerateInterpolator LLJLILLLLZIIL = new AccelerateDecelerateInterpolator();
    public final AnimatorSet LLJLL = new AnimatorSet();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gx9;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1061767398) {
            return null;
        }
        return this;
    }

    public final List<View> yp() {
        return C1697810uHb.LJIIJJI(this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJJ, this.LLJJL);
    }

    public final void ip() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int width;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        TextView textView = this.LLJJIJIL;
        if (textView != null) {
            CharSequence text = textView.getText();
            Layout layout = textView.getLayout();
            if (layout != null) {
                String string = text.subSequence(layout.getLineStart(textView.getLineCount() - 1), text.length()).toString();
                Rect rect = new Rect();
                int i = 0;
                textView.getPaint().getTextBounds(string, 0, string.length(), rect);
                int iWidth = rect.width();
                View view = this.LLJJJJ;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                        return;
                    }
                    boolean zLJJ = C497740JfY.LJJ();
                    if (zLJJ) {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        width = (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) ? 0 : marginLayoutParams5.leftMargin;
                    } else {
                        width = textView.getWidth();
                        if (iWidth <= width) {
                            width = iWidth;
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    int i2 = (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) ? 0 : marginLayoutParams4.topMargin;
                    if (zLJJ) {
                        int width2 = textView.getWidth();
                        if (iWidth > width2) {
                            iWidth = width2;
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                        iWidth = (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4) == null) ? 0 : marginLayoutParams2.rightMargin;
                    }
                    ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                    if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                        i = marginLayoutParams3.bottomMargin;
                    }
                    marginLayoutParams.setMargins(width, i2, iWidth, i);
                }
            }
        }
    }

    public final void lp() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        this.LLJLL.cancel();
        this.LLJLL.removeAllListeners();
        View view = this.LLJJIII;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        for (View view2 : yp()) {
            if (view2 != null) {
                C786410Ut5.T4(view2, 1.0f);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.IGiftAnchorPanelGiftPageBottomAbility
    public final void rs2() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorY2;
        ViewPropertyAnimator duration2;
        if (!LiveGiftAnchorListCacheSetting.INSTANCE.enable()) {
            View view = this.LLJJIII;
            if (view == null || (viewPropertyAnimatorAnimate = view.animate()) == null || (viewPropertyAnimatorY = viewPropertyAnimatorAnimate.y(C1117830fC9.LIZJ(94))) == null || (duration = viewPropertyAnimatorY.setDuration(250L)) == null) {
                return;
            }
            duration.setInterpolator(this.LLJLILLLLZIIL);
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        lp();
        View view2 = this.LLJJIII;
        if (view2 == null || (viewPropertyAnimatorAnimate2 = view2.animate()) == null || (viewPropertyAnimatorY2 = viewPropertyAnimatorAnimate2.y(C1117830fC9.LIZJ(94))) == null || (duration2 = viewPropertyAnimatorY2.setDuration(250L)) == null) {
            return;
        }
        duration2.setInterpolator(this.LLJLILLLLZIIL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public static boolean tp(C1146350fw9 c1146350fw9) {
        GiftPanelCardletByCreator.CardletButton cardletButton;
        Integer numValueOf;
        GiftPanelCardletByCreator giftPanelCardletByCreator;
        GiftPanelCardletByCreator.CardletButton cardletButton2;
        long j = c1146350fw9.LL;
        GiftPanelCardletByCreator giftPanelCardletByCreator2 = (GiftPanelCardletByCreator) C13LP.LJJJLL(c1146350fw9.LLJ);
        if (giftPanelCardletByCreator2 != null && (cardletButton = giftPanelCardletByCreator2.cardletButton) != null) {
            int i = cardletButton.buttonPriority;
            GiftsInfoByCreator giftsInfoByCreator = c1146350fw9.LLJIJIL.LIZ;
            if (giftsInfoByCreator != null && (giftPanelCardletByCreator = giftsInfoByCreator.liveGoalCardlet) != null && (cardletButton2 = giftPanelCardletByCreator.cardletButton) != null) {
                numValueOf = Integer.valueOf(cardletButton2.buttonPriority);
            } else {
                numValueOf = null;
            }
            return sp(i, numValueOf, j);
        }
        return false;
    }

    public static boolean up(C1146350fw9 c1146350fw9) {
        Integer numValueOf;
        GiftPanelCardletByCreator giftPanelCardletByCreator;
        long j = c1146350fw9.LL;
        GiftPanelCardletByCreator giftPanelCardletByCreator2 = (GiftPanelCardletByCreator) C13LP.LJJJLL(c1146350fw9.LLJ);
        if (giftPanelCardletByCreator2 != null) {
            int i = giftPanelCardletByCreator2.cardletPriority;
            GiftsInfoByCreator giftsInfoByCreator = c1146350fw9.LLJIJIL.LIZ;
            if (giftsInfoByCreator != null && (giftPanelCardletByCreator = giftsInfoByCreator.liveGoalCardlet) != null) {
                numValueOf = Integer.valueOf(giftPanelCardletByCreator.cardletPriority);
            } else {
                numValueOf = null;
            }
            return sp(i, numValueOf, j);
        }
        return false;
    }

    public final List<ObjectAnimator> hp(boolean z) {
        float f;
        List<View> listYp = yp();
        ArrayList arrayList = new ArrayList();
        for (View view : listYp) {
            if (view != null) {
                Property property = View.ALPHA;
                float[] fArr = new float[2];
                float f2 = 0.0f;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                fArr[0] = f;
                if (z) {
                    f2 = 1.0f;
                }
                fArr[1] = f2;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
                objectAnimatorOfFloat.setDuration(100L);
                objectAnimatorOfFloat.setInterpolator(this.LLJLIL);
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        super.onViewCreated(view);
        this.LLJJIII = view.findViewById(R.id.iyw);
        this.LLJJIJI = (ImageView) view.findViewById(R.id.azu);
        this.LLJJIJIIJIL = (TextView) view.findViewById(R.id.azv);
        this.LLJJIJIL = (TextView) view.findViewById(R.id.azs);
        this.LLJJJ = view.findViewById(R.id.k3y);
        this.LLJJJIL = view.findViewById(R.id.d82);
        this.LLJJJJ = view.findViewById(R.id.azt);
        this.LLJJJJJIL = (ImageView) view.findViewById(R.id.b8y);
        this.LLJJJJLIIL = (ImageView) view.findViewById(R.id.jte);
        this.LLJJL = view.findViewById(R.id.azj);
        this.LLJJLIIIJLLLLLLLZ = (ImageView) view.findViewById(R.id.azk);
        this.LLJL = (TextView) view.findViewById(R.id.azl);
        if (LiveGiftAnchorListCacheSetting.INSTANCE.enable() && (view2 = this.LLJJIII) != null) {
            if (view2.isLaidOut() && !view2.isLayoutRequested()) {
                if (!this.LLJLLIL) {
                    this.LLJLLIL = true;
                    View view3 = this.LLJJIII;
                    if (view3 != null) {
                        lp();
                        C786410Ut5.Ld(view3, C1117830fC9.LIZJ(94));
                        return;
                    }
                    return;
                }
                return;
            }
            view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(this, 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(final X.C1146350fw9 r25) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.GiftAnchorPanelGiftPageGiftPageBottomAssem.op(X.0fw9):void");
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.IGiftAnchorPanelGiftPageBottomAbility
    public final void qC(C1146350fw9 c1146350fw9) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorY;
        ViewPropertyAnimator duration;
        Float fValueOf = null;
        if (LiveGiftAnchorListCacheSetting.INSTANCE.enable()) {
            AnonymousClass0956 anonymousClass0956 = this.LLJLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            lp();
            C500260Jjc.LLFFF(this.LLJJIII);
            this.LLJLLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1145120fuA(this, c1146350fw9, null), 3);
        } else {
            C500260Jjc.LLFFF(this.LLJJIII);
            View view = this.LLJJIII;
            if (view != null) {
                fValueOf = Float.valueOf(view.getY());
            }
            if (Intrinsics.LIZLLL(fValueOf, 0.0f)) {
                AnimatorSet animatorSet = this.LLJLL;
                animatorSet.playTogether(hp(false));
                animatorSet.addListener(new AAListenerS139S0300000_17(animatorSet, this, c1146350fw9, 4));
                animatorSet.start();
            } else {
                op(c1146350fw9);
                View view2 = this.LLJJIII;
                if (view2 != null && (viewPropertyAnimatorAnimate = view2.animate()) != null && (viewPropertyAnimatorY = viewPropertyAnimatorAnimate.y(0.0f)) != null && (duration = viewPropertyAnimatorY.setDuration(250L)) != null) {
                    duration.setInterpolator(this.LLJLILLLLZIIL);
                }
            }
        }
        boolean zUp = up(c1146350fw9);
        boolean zTp = tp(c1146350fw9);
        boolean z = c1146350fw9.LLJJIJI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_preview_banner_show");
        C1133640fbe.LIZIZ(c474500IjALIZ, c1146350fw9, zUp, zTp, z);
        c474500IjALIZ.LIZ();
    }

    public final void kp(String str, C1146350fw9 c1146350fw9) {
        if (str.length() == 0) {
            return;
        }
        C495520Jby c495520Jby = new C495520Jby(str);
        String str2 = "gift_panel_creator";
        c495520Jby.LIZJ("show_entrance", "gift_panel_creator");
        c495520Jby.LIZJ("live_type", C500260Jjc.LJJJJJL(((C1146120fvm) this.LLJJI.getValue()).LLILLJJLI));
        if (c1146350fw9.LLJJIJI) {
            str2 = "gift_panel_creator_recommended_gift";
        }
        c495520Jby.LIZJ("entrance", str2);
        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "enter_from_gift") == null) {
            c495520Jby.LIZIZ(c1146350fw9.LL, "enter_from_gift");
        }
        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "gift_id") == null) {
            c495520Jby.LIZIZ(c1146350fw9.LL, "gift_id");
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.AwS561S0100000_17] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mp(kotlin.jvm.internal.AwS561S0100000_17 r9, X.InterfaceC1364105Vn r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1145130fuB
            if (r0 == 0) goto L76
            r7 = r10
            X.0fuB r7 = (X.C1145130fuB) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r1 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 != r5) goto L7c
            kotlin.jvm.functions.Function0 r9 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            r8.LLJZ = r5
        L26:
            r9.invoke()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r8.LLJZ
            if (r0 != 0) goto L26
            r7.LL = r9
            r7.LLILZ = r5
            android.view.View r4 = r8.LLJJIII
            if (r4 != 0) goto L40
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L3d:
            if (r1 != r6) goto L24
            return r6
        L40:
            X.1DEt r3 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r7)
            r3.<init>(r5, r0)
            r3.LJIJJ()
            Y.ARunnableS73S0200000_4 r2 = new Y.ARunnableS73S0200000_4
            r0 = 38
            r2.<init>(r3, r4, r0)
            kotlin.jvm.internal.AwS370S0200000_4 r1 = new kotlin.jvm.internal.AwS370S0200000_4
            r0 = 99
            r1.<init>(r4, r2, r0)
            r3.LJJII(r1)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r4, r2)
            java.lang.Object r1 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L6d
            X.C099Q.LIZJ(r7)
        L6d:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L3d
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L3d
        L76:
            X.0fuB r7 = new X.0fuB
            r7.<init>(r8, r10)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.GiftAnchorPanelGiftPageGiftPageBottomAssem.mp(kotlin.jvm.internal.AwS561S0100000_17, X.05Vn):java.lang.Object");
    }

    public static boolean sp(int i, Integer num, long j) {
        List<C1125920fPC> list;
        int iIntValue;
        C1125860fP6 c1125860fP6 = C1125820fP2.LJFF().LIZ;
        if (c1125860fP6 != null && (!c1125860fP6.LIZJ().isEmpty()) && (list = c1125860fP6.LIZJ) != null && !list.isEmpty()) {
            Iterator<C1125920fPC> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ == j) {
                    if (num != null && (iIntValue = num.intValue()) != i && iIntValue != 0) {
                        if (i == 0 || iIntValue < i) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
