package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui;

import X.AbstractC20229814Do;
import X.C01GW;
import X.C098200Yq;
import X.C1022820ciu;
import X.C1037350d6L;
import X.C1318500kPo;
import X.C1338400kvu;
import X.C14EU;
import X.C1533950q1J;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16G0;
import X.C1749280vcc;
import X.C1766560w4U;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20229214Di;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C452501pT;
import X.C487700JAq;
import X.C497820Jfg;
import X.C786410Ut5;
import X.InterfaceC1058150ddt;
import X.InterfaceC1318520kPq;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS163S0100000_29;
import Y.ACListenerS164S0100000_30;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS16S0500000_26;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model.AiPdpEnterParams;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model.AiPdpNativeData;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model.AiPdpProductInfo;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model.AiPdpShopifyInfo;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model.AiPdpWebSiteInfo;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui.CommerceAiPdpFragment;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes31.dex */
public final class CommerceAiPdpFragment extends Fragment implements DialogInterface.OnDismissListener, InterfaceC1058150ddt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiODo6KyHELIOS4vJiElLTc/ICA9ZiQlOSsjZjAlZww8JSgpOyw2CSwcLT8VOiQrJCo9PA==";
    public boolean LL;
    public AiPdpEnterParams LLILLJJLI;
    public View LLILLL;
    public C16G0 LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public C1338400kvu LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public String LLIZLLLIL = "default";
    public String LLJ = "view more";
    public String LLJILJILJ = "";
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(143));

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    public final IQuickActionPlayerService MR() {
        return (IQuickActionPlayerService) this.LLJILLL.getValue();
    }

    public final void OR() {
        DialogFragment dialogFragment;
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof TuxSheet) || (dialogFragment = (DialogFragment) parentFragment) == null || dialogFragment.getDialog() == null) {
            return;
        }
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(dialogFragment, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LIZ(true);
        tuxImmersionBarLIZJ.LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1318500kPo c1318500kPo;
        super.onDestroyView();
        EventBus.LIZLLL().LJJI(this);
        View view = getView();
        if (view == null || (c1318500kPo = (C1318500kPo) view.findViewById(R.id.efz)) == null) {
            return;
        }
        c1318500kPo.setDispatchTouchInterceptor(null);
    }

    public final void NR(String str) {
        Function1<String, Unit> function1;
        Aweme aweme;
        if (str.length() > 0) {
            AiPdpEnterParams aiPdpEnterParams = this.LLILLJJLI;
            String str2 = null;
            if (aiPdpEnterParams != null) {
                aweme = aiPdpEnterParams.aweme;
            } else {
                aweme = null;
            }
            String str3 = this.LLJ;
            if (aiPdpEnterParams != null) {
                str2 = aiPdpEnterParams.refer;
            }
            C487700JAq.LIZ(str, str3, str2, aweme);
        }
        AiPdpEnterParams aiPdpEnterParams2 = this.LLILLJJLI;
        if (aiPdpEnterParams2 != null && (function1 = aiPdpEnterParams2.onExpandAction) != null) {
            function1.invoke("");
        }
    }

    public final void PR(int i) {
        ViewGroup.LayoutParams layoutParams;
        C1338400kvu c1338400kvu = this.LLJI;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (c1338400kvu != null) {
            layoutParams = c1338400kvu.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
            } else {
                return;
            }
        }
        C1338400kvu c1338400kvu2 = this.LLJI;
        if (c1338400kvu2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1338400kvu2);
            c1338400kvu2.setLayoutParams(marginLayoutParams);
        }
    }

    public final void RR(boolean z) {
        if (isResumed() && this.LLJILJIL) {
            if (z) {
                View view = getView();
                if (view != null) {
                    HandlerHook.viewPost(view, new ARunnableS116S0100000_16(this, 40));
                }
                MR().playingVideoMute();
                return;
            }
            MR().playingVideoUnMute();
            MR().playingVideoResume();
        }
    }

    public final void SR(float f) {
        View viewFindViewById;
        View viewFindViewById2;
        Integer numValueOf;
        Integer numValueOf2;
        View view = getView();
        Integer numValueOf3 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.q7i);
        } else {
            viewFindViewById = null;
        }
        View view2 = getView();
        if (view2 != null) {
            viewFindViewById2 = view2.findViewById(R.id.q7h);
        } else {
            viewFindViewById2 = null;
        }
        int i = 0;
        if (f >= 0.0f) {
            double d = f;
            if (d < 0.6d) {
                if (viewFindViewById2 != null) {
                    C786410Ut5.T4(viewFindViewById2, 0.0f);
                    C786410Ut5.LJLLLLLL(4, viewFindViewById2);
                }
                float f2 = (float) ((d * (-1.6d)) + ((double) 1));
                if (viewFindViewById != null) {
                    C786410Ut5.T4(viewFindViewById, f2);
                    if (f2 <= 0.1d) {
                        i = 4;
                    }
                    C786410Ut5.LJLLLLLL(i, viewFindViewById);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CommerceAiPdpFragment [0, 0.6): halfAlpha=");
                sbLIZ.append(f2);
                sbLIZ.append(", halfVis=");
                if (viewFindViewById != null) {
                    numValueOf2 = Integer.valueOf(viewFindViewById.getVisibility());
                } else {
                    numValueOf2 = null;
                }
                sbLIZ.append(numValueOf2);
                sbLIZ.append(", fullVis=");
                if (viewFindViewById2 != null) {
                    numValueOf3 = Integer.valueOf(viewFindViewById2.getVisibility());
                }
                sbLIZ.append(numValueOf3);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
        }
        double d2 = f;
        if (d2 >= 0.6d) {
            float f3 = (float) ((d2 * 2.5d) - 1.5d);
            if (viewFindViewById2 != null) {
                C786410Ut5.T4(viewFindViewById2, f3);
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            if (viewFindViewById != null) {
                C786410Ut5.T4(viewFindViewById, 0.0f);
                C786410Ut5.LJLLLLLL(4, viewFindViewById);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CommerceAiPdpFragment [0.6, 1.0]: fullAlpha=");
            sbLIZ2.append(f3);
            sbLIZ2.append(", fullVis=");
            if (viewFindViewById2 != null) {
                numValueOf = Integer.valueOf(viewFindViewById2.getVisibility());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(", halfVis=");
            if (viewFindViewById != null) {
                numValueOf3 = Integer.valueOf(viewFindViewById.getVisibility());
            }
            sbLIZ2.append(numValueOf3);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        if (viewFindViewById2 != null) {
            C786410Ut5.T4(viewFindViewById2, 0.0f);
            C786410Ut5.LJLLLLLL(4, viewFindViewById2);
        }
        if (viewFindViewById == null) {
            return;
        }
        C786410Ut5.T4(viewFindViewById, 1.0f);
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    @Override // android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDismiss(android.content.DialogInterface r20) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui.CommerceAiPdpFragment.onDismiss(android.content.DialogInterface):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(X.C602310Njp r6) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui.CommerceAiPdpFragment.onEvent(X.0Njp):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1037350d6L c1037350d6L) {
        Function1<String, Unit> function1;
        AiPdpEnterParams aiPdpEnterParams = this.LLILLJJLI;
        if (aiPdpEnterParams != null && (function1 = aiPdpEnterParams.onExpandAction) != null) {
            function1.invoke("");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    @Override // X.InterfaceC1058150ddt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFFI(com.bytedance.tux.sheet.sheet.TuxSheet r6, float r7) {
        /*
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7
            return
        L7:
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r0 > 0) goto L81
            boolean r0 = X.C299110Bnx.LIZ()
            if (r0 == 0) goto L6c
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            X.16BC r1 = X.C1391190mJ3.LJIIIZ(r5)
            boolean r0 = r1 instanceof com.bytedance.tux.sheet.sheet.TuxSheetBehavior
            if (r0 == 0) goto L7f
            com.bytedance.tux.sheet.sheet.TuxSheetBehavior r1 = (com.bytedance.tux.sheet.sheet.TuxSheetBehavior) r1
            if (r1 == 0) goto L7f
            int r0 = r1.getPeekHeight()
        L25:
            android.view.View r3 = r5.LLILLL
            if (r3 == 0) goto L2f
            float r1 = -r7
            float r0 = (float) r0
            float r1 = r1 * r0
            X.C786410Ut5.ed(r3, r1)
        L2f:
            r0 = -1110651699(0xffffffffbdcccccd, float:-0.1)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3a
            java.lang.String r0 = "pull_down"
            r5.LLIZLLLIL = r0
        L3a:
            r5.SR(r7)
            android.content.Context r3 = r5.getContext()
            if (r3 == 0) goto L6b
            int r4 = X.C497820Jfg.LIZJ(r3)
            r0 = 44
            float r1 = (float) r0
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = (int) r1
            int r4 = r4 + r0
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L89
            r0 = 4612811918334230528(0x4004000000000000, double:2.5)
            double r2 = (double) r7
            double r2 = r2 * r0
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r2 = r2 - r0
            double r0 = (double) r4
            double r2 = r2 * r0
            int r0 = (int) r2
            r5.PR(r0)
        L6b:
            return
        L6c:
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            X.16BC r1 = X.C1391190mJ3.LJIIIZ(r5)
            boolean r0 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L7f
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            if (r1 == 0) goto L7f
            int r0 = r1.getPeekHeight()
            goto L25
        L7f:
            r0 = 0
            goto L25
        L81:
            android.view.View r0 = r5.LLILLL
            if (r0 == 0) goto L3a
            X.C786410Ut5.ed(r0, r1)
            goto L3a
        L89:
            r5.PR(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui.CommerceAiPdpFragment.LLLFFI(com.bytedance.tux.sheet.sheet.TuxSheet, float):void");
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        boolean z;
        DialogFragment dialogFragment;
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    OR();
                    RR(false);
                    return;
                }
                return;
            }
            OR();
            SR(0.0f);
            RR(false);
            return;
        }
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) parentFragment) != null && dialogFragment.getDialog() != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(dialogFragment, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIJ(z2);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LJFF(-16777216);
            tuxImmersionBarLIZJ.LIZIZ.LJII(true);
            tuxImmersionBarLIZJ.LIZ(false);
            tuxImmersionBarLIZJ.LIZLLL();
        }
        SR(1.0f);
        RR(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        final String str;
        String str2;
        AiPdpNativeData aiPdpNativeData;
        AiPdpProductInfo aiPdpProductInfo;
        String str3;
        String creativeIdStr;
        AwemeRawAd awemeRawAd;
        AiPdpShopifyInfo aiPdpShopifyInfo;
        String str4;
        AiPdpProductInfo aiPdpProductInfo2;
        AiPdpShopifyInfo aiPdpShopifyInfo2;
        AiPdpShopifyInfo aiPdpShopifyInfo3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String str5;
        AiPdpWebSiteInfo aiPdpWebSiteInfo;
        EventBus.LIZLLL().LJIJJ(this);
        final AiPdpEnterParams aiPdpEnterParams = this.LLILLJJLI;
        if (aiPdpEnterParams == null) {
            return;
        }
        C1318500kPo c1318500kPo = (C1318500kPo) view.findViewById(R.id.efz);
        final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        InterfaceC1318520kPq interfaceC1318520kPq = new InterfaceC1318520kPq(scaledTouchSlop) { // from class: X.0GlQ
            public final int LIZ;
            public final Function0<Unit> LIZIZ;
            public Pair<Float, Float> LIZJ;
            public Pair<Float, Float> LIZLLL;

            {
                AFwS192S0000000_6 aFwS192S0000000_6 = AFwS192S0000000_6.get$arr$(407);
                this.LIZ = scaledTouchSlop;
                this.LIZIZ = aFwS192S0000000_6;
                Float fValueOf = Float.valueOf(-1.0f);
                this.LIZJ = new Pair<>(fValueOf, fValueOf);
                Float fValueOf2 = Float.valueOf(0.0f);
                this.LIZLLL = new Pair<>(fValueOf2, fValueOf2);
            }

            @Override // X.InterfaceC1318520kPq
            public final void LIZ(MotionEvent motionEvent) {
                Integer numValueOf;
                if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                    if (numValueOf.intValue() == 0) {
                        this.LIZJ = new Pair<>(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
                        this.LIZLLL = new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
                        this.LIZIZ.invoke();
                    } else if (numValueOf.intValue() == 2) {
                        LIZIZ(motionEvent);
                    } else {
                        if (numValueOf.intValue() != 1) {
                            return;
                        }
                        LIZIZ(motionEvent);
                        if (this.LIZLLL.getFirst().floatValue() >= this.LIZ) {
                            return;
                        }
                        this.LIZLLL.getSecond().floatValue();
                    }
                }
            }

            public final void LIZIZ(MotionEvent motionEvent) {
                this.LIZLLL = new Pair<>(Float.valueOf(this.LIZLLL.getFirst().floatValue() + Math.abs(motionEvent.getRawX() - this.LIZJ.getFirst().floatValue())), Float.valueOf(this.LIZLLL.getSecond().floatValue() + Math.abs(motionEvent.getRawY() - this.LIZJ.getSecond().floatValue())));
            }
        };
        if (c1318500kPo != null) {
            c1318500kPo.setDispatchTouchInterceptor(interfaceC1318520kPq);
        }
        TextView textView = (TextView) view.findViewById(R.id.jkv);
        AwemeRawAd awemeRawAd2 = null;
        if (textView != null) {
            AiPdpNativeData aiPdpNativeData2 = aiPdpEnterParams.nativeData;
            if (aiPdpNativeData2 != null && (aiPdpWebSiteInfo = aiPdpNativeData2.webSiteInfo) != null) {
                str5 = aiPdpWebSiteInfo.pdpTitle;
            } else {
                str5 = null;
            }
            textView.setText(str5);
        }
        View viewFindViewById = view.findViewById(R.id.e26);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 11), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.e2_);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 12), viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.q7g);
        if (viewFindViewById3 != null) {
            layoutParams = viewFindViewById3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C497820Jfg.LIZJ(view.getContext());
            C786410Ut5.W5(viewFindViewById3, marginLayoutParams);
        }
        View viewFindViewById4 = view.findViewById(R.id.q7i);
        View viewFindViewById5 = view.findViewById(R.id.q7h);
        if (viewFindViewById4 != null) {
            C786410Ut5.T4(viewFindViewById4, 1.0f);
        }
        boolean z = false;
        if (viewFindViewById4 != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById4);
        }
        if (viewFindViewById5 != null) {
            C786410Ut5.T4(viewFindViewById5, 0.0f);
            C786410Ut5.LJLLLLLL(4, viewFindViewById5);
        }
        C1338400kvu c1338400kvu = (C1338400kvu) view.findViewById(R.id.auv);
        this.LLJI = c1338400kvu;
        c1338400kvu.setLayoutManager(new LinearLayoutManager(getContext()));
        C20229214Di c20229214Di = new C20229214Di(C1697810uHb.LJIIJJI(new AbstractC20229814Do() { // from class: X.14Ds
            {
                EnumC20229514Dl enumC20229514Dl = EnumC20229514Dl.HEADER;
            }
        }, new AbstractC20229814Do() { // from class: X.14Du
            {
                EnumC20229514Dl enumC20229514Dl = EnumC20229514Dl.PRODUCT_INFO;
            }
        }, new AbstractC20229814Do() { // from class: X.14Dt
            {
                EnumC20229514Dl enumC20229514Dl = EnumC20229514Dl.LYNX;
            }
        }), aiPdpEnterParams);
        c20229214Di.LLILZLL = new AwS644S0100000_30(this, 7);
        c20229214Di.LLIZ = new AwS609S0100000_30(this, 41);
        c1338400kvu.setAdapter(c20229214Di);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.cbk);
        C786410Ut5.Td(C786410Ut5.ne(requireContext()), R.layout.akb, frameLayout, true);
        C197039127h c197039127h = (C197039127h) frameLayout.findViewById(R.id.dr9);
        c197039127h.setBackgroundRadius(100);
        AiPdpNativeData aiPdpNativeData3 = aiPdpEnterParams.nativeData;
        if (aiPdpNativeData3 != null && (aiPdpShopifyInfo3 = aiPdpNativeData3.pdpShopifyInfo) != null && aiPdpShopifyInfo3.isShoppingShopify()) {
            z = true;
        }
        this.LL = z;
        AiPdpNativeData aiPdpNativeData4 = aiPdpEnterParams.nativeData;
        if (aiPdpNativeData4 != null && (aiPdpShopifyInfo2 = aiPdpNativeData4.pdpShopifyInfo) != null) {
            str = aiPdpShopifyInfo2.shopifyPdpUrl;
        } else {
            str = null;
        }
        if (z && C1533950q1J.LJ(str)) {
            if (str != null) {
                AiPdpNativeData aiPdpNativeData5 = aiPdpEnterParams.nativeData;
                if (aiPdpNativeData5 != null && (aiPdpProductInfo2 = aiPdpNativeData5.productInfo) != null) {
                    str4 = aiPdpProductInfo2.placeOrderText;
                } else {
                    str4 = null;
                }
                if (C1533950q1J.LJ(str4)) {
                    c197039127h.setText(str4);
                } else {
                    c197039127h.setText(getString(2131820793));
                }
                this.LLJ = "shopify";
                C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.14Dh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String str6;
                        AiPdpShopifyInfo aiPdpShopifyInfo4;
                        CommerceAiPdpFragment commerceAiPdpFragment = this.LL;
                        commerceAiPdpFragment.LLIZ = true;
                        commerceAiPdpFragment.LLIZLLLIL = "auto";
                        AiPdpNativeData aiPdpNativeData6 = aiPdpEnterParams.nativeData;
                        if (aiPdpNativeData6 == null || (aiPdpShopifyInfo4 = aiPdpNativeData6.pdpShopifyInfo) == null || (str6 = aiPdpShopifyInfo4.shopifyId) == null) {
                            str6 = "";
                        }
                        IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
                        if (iShopifySkuCheckoutService != null) {
                            iShopifySkuCheckoutService.LIZJ(this.LL.requireContext(), aiPdpEnterParams.aweme, str, str6, "feed_sku_checkout");
                        }
                        AiPdpEnterParams aiPdpEnterParams2 = aiPdpEnterParams;
                        C487700JAq.LIZ("button", this.LL.LLJ, aiPdpEnterParams2.refer, aiPdpEnterParams2.aweme);
                    }
                });
            }
        } else {
            AiPdpEnterParams aiPdpEnterParams2 = this.LLILLJJLI;
            if (aiPdpEnterParams2 != null && (aiPdpNativeData = aiPdpEnterParams2.nativeData) != null && (aiPdpProductInfo = aiPdpNativeData.productInfo) != null) {
                str2 = aiPdpProductInfo.viewMoreText;
            } else {
                str2 = null;
            }
            if (C1533950q1J.LJ(str2)) {
                c197039127h.setText(str2);
            } else {
                c197039127h.setText(getString(2131833078));
            }
            C786410Ut5.U8(c197039127h, new ACListenerS164S0100000_30(this, 8));
        }
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.q7u);
        c1749280vcc.LJ();
        HandlerHook.viewPost(view, new ARunnableS16S0500000_26(view, this, frameLayout, c1749280vcc, c1338400kvu, 0));
        this.LLJIJIL = System.currentTimeMillis();
        Aweme aweme = aiPdpEnterParams.aweme;
        AiPdpNativeData aiPdpNativeData6 = aiPdpEnterParams.nativeData;
        if (aiPdpNativeData6 != null && (aiPdpShopifyInfo = aiPdpNativeData6.pdpShopifyInfo) != null) {
            str3 = aiPdpShopifyInfo.shopifyPdpUrl;
        } else {
            str3 = null;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        String str6 = aiPdpEnterParams.refer;
        if (aweme != null) {
            awemeRawAd2 = aweme.getAwemeRawAd();
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "commerce_ai_pdp_page_show", awemeRawAd2);
        c1022820ciuLIZLLL.LIZIZ(str3, "pdp_url");
        c1022820ciuLIZLLL.LIZIZ(creativeIdStr, "cid");
        c1022820ciuLIZLLL.LIZIZ(str6, "enter_from");
        c1022820ciuLIZLLL.LJII();
        this.LLJILJIL = MR().isVideoPlaying();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.akc, viewGroup, false);
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
