package com.ss.android.ugc.aweme.tako.botpage.components.action.multiple;

import X.AbstractC1585810rMx;
import X.AnonymousClass1418;
import X.C019F;
import X.C01GW;
import X.C07I3;
import X.C098200Yq;
import X.C0DSB;
import X.C0GSQ;
import X.C0H9N;
import X.C0HZQ;
import X.C1004300cF2;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C14J7;
import X.C1558520qew;
import X.C1637806bA;
import X.C1857420yR2;
import X.C1858670yT3;
import X.C189200o6;
import X.C19719912Dl;
import X.C19MB;
import X.C2217381BqS;
import X.C298810BnT;
import X.C326880Cre;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C842150X1x;
import X.InterfaceC1587906Jp;
import X.InterfaceC1859630yUb;
import X.InterfaceC1861810yY7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC689540R2y;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC20306814d0;
import Y.ATListenerS349S0200000_30;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMultipleSelectAssem<ITEM extends InterfaceC689540R2y> extends ReusedUIContentAssem<TakoMultipleSelectAssem<ITEM>> implements InterfaceC712990Rxx<ITEM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public static final int LLLFF;
    public static final int LLLFFI;
    public static final int LLLFZ;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS574S0100000_30((TakoMultipleSelectAssem) this, 229));
    public final AssemVMLazy LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public C0HZQ LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public RecyclerView LLJLL;
    public View LLJLLIL;
    public final C14J7 LLJLLL;
    public final ViewOnLayoutChangeListenerC20306814d0 LLJZ;
    public ITEM LLJZIJLIL;
    public boolean LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMultipleSelectAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        LLLFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        LLLFZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.14J7] */
    public TakoMultipleSelectAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS574S0100000_30(c19719912DlLIZ, 228), AFwS274S0000000_30.get$arr$(152), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS574S0100000_30((TakoMultipleSelectAssem) this, 227));
        this.LLJJL = C452501pT.LIZIZ(new AwS574S0100000_30((TakoMultipleSelectAssem) this, 230));
        this.LLJLLL = new AbstractC1585810rMx(this) { // from class: X.14J7
            public final /* synthetic */ TakoMultipleSelectAssem<ITEM> LL;

            {
                this.LL = this;
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                this.LL.tp();
            }
        };
        this.LLJZ = new ViewOnLayoutChangeListenerC20306814d0(this, 1);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        RecyclerView recyclerView = this.LLJLL;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.LLJLLL);
        }
        View view = this.LLJLLIL;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LLJZ);
        }
        this.LLJLLIL = null;
    }

    public final TakoMultipleSelectVM ep() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (TakoMultipleSelectVM) assemVMLazy.getValue();
    }

    public final TakoCardAbility hp() {
        return (TakoCardAbility) this.LLJJJJ.getValue();
    }

    public final boolean kp() {
        C326880Cre c326880CreLJJJJZI;
        ITEM item = this.LLJZIJLIL;
        InterfaceC1861810yY7 interfaceC1861810yY7 = item instanceof InterfaceC1861810yY7 ? (InterfaceC1861810yY7) item : null;
        if (interfaceC1861810yY7 != null && (c326880CreLJJJJZI = interfaceC1861810yY7.LJJJJZI()) != null) {
            Message message = c326880CreLJJJJZI.LLILLL;
            if (!C1858670yT3.LJIIJ(message) || C1004300cF2.LIZJ(message.LJIIIZ(), message.serverTime)) {
                return false;
            }
        }
        return true;
    }

    public final void lp() {
        ConstraintLayout constraintLayout;
        if (this.LLL) {
            return;
        }
        TakoCardAbility takoCardAbilityHp = hp();
        View viewQk0 = takoCardAbilityHp != null ? takoCardAbilityHp.qk0() : null;
        if (!(viewQk0 instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) viewQk0) == null) {
            return;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJI(R.id.umx, 3);
        c19mb.LJI(R.id.umx, 4);
        c19mb.LJIIIZ(R.id.umx, 3, 0, 3, LLLFFI);
        c19mb.LIZIZ(constraintLayout);
        this.LLL = true;
    }

    public final void mp() {
        ConstraintLayout constraintLayout;
        View view = this.LLJL;
        if (view != null) {
            view.setBackground(null);
        }
        C0HZQ c0hzq = this.LLJJLIIIJLLLLLLLZ;
        if (c0hzq != null) {
            c0hzq.setChecked(false);
        }
        C0HZQ c0hzq2 = this.LLJJLIIIJLLLLLLLZ;
        if (c0hzq2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hzq2);
            c0hzq2.setTranslationY(0.0f);
        }
        if (this.LLL) {
            TakoCardAbility takoCardAbilityHp = hp();
            View viewQk0 = takoCardAbilityHp != null ? takoCardAbilityHp.qk0() : null;
            if ((viewQk0 instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) viewQk0) != null) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJI(R.id.umx, 3);
                c19mb.LJI(R.id.umx, 4);
                c19mb.LJIIIIZZ(R.id.umx, 3, R.id.ety, 3);
                c19mb.LJIIIIZZ(R.id.umx, 4, R.id.ety, 4);
                c19mb.LIZIZ(constraintLayout);
                this.LLL = false;
            }
        }
        View view2 = this.LLJL;
        if (view2 != null) {
            C0DSB.LIZIZ(view2);
        }
        View view3 = this.LLJLIL;
        if (view3 != null) {
            C0DSB.LIZIZ(view3);
        }
    }

    public final boolean sp() {
        ITakoAIBotUIAbility iTakoAIBotUIAbility = (ITakoAIBotUIAbility) this.LLJJJJLIIL.getValue();
        return (iTakoAIBotUIAbility != null && iTakoAIBotUIAbility.ve2() && C07I3.LIZ()) || C298810BnT.LIZ();
    }

    public final void tp() {
        TakoCardAbility takoCardAbilityHp;
        View viewQk0;
        View view;
        C0HZQ c0hzq = this.LLJJLIIIJLLLLLLLZ;
        if (c0hzq == null || c0hzq.getVisibility() != 0 || (takoCardAbilityHp = hp()) == null || (viewQk0 = takoCardAbilityHp.qk0()) == null || viewQk0.getHeight() <= 0 || 1 == 0) {
            return;
        }
        Object parent = viewQk0.getParent();
        if (!(parent instanceof C0GSQ) || (view = (View) parent) == null) {
            return;
        }
        if (viewQk0.getHeight() <= LLLFF) {
            C0HZQ c0hzq2 = this.LLJJLIIIJLLLLLLLZ;
            if (c0hzq2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hzq2);
                c0hzq2.setTranslationY(0.0f);
                return;
            }
            return;
        }
        C0HZQ c0hzq3 = this.LLJJLIIIJLLLLLLLZ;
        if (c0hzq3 != null) {
            if (view.getTop() >= 0) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hzq3);
                c0hzq3.setTranslationY(0.0f);
                return;
            }
            int top = viewQk0.getTop() + c0hzq3.getTop();
            int i = -view.getTop();
            int i2 = LLLFFI;
            float fLIZLLL = C13LZ.LIZLLL((i + i2) - top, 0.0f, ((view.getHeight() - i2) - LLLFZ) - top);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hzq3);
            c0hzq3.setTranslationY(fLIZLLL);
        }
    }

    public static boolean ip(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                if (spanned.getSpans(0, spanned.length(), InterfaceC1859630yUb.class).length != 0) {
                    return true;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (ip(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static View op(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginEnd(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        layoutParams.setMarginStart(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.W5(view, layoutParams);
        view.setId(View.generateViewId());
        C0DSB.LIZIZ(view);
        return view;
    }

    public final Bitmap cp(View view) {
        View viewQk0;
        boolean z;
        boolean z2;
        boolean z3;
        Object c098200Yq;
        ViewGroup viewGroupY4;
        int left;
        int left2;
        boolean z4;
        int iIntValue;
        int right;
        int right2;
        boolean z5;
        int width;
        C0HZQ c0hzq;
        C0HZQ c0hzq2;
        TakoCardAbility takoCardAbilityHp = hp();
        if (takoCardAbilityHp != null) {
            viewQk0 = takoCardAbilityHp.qk0();
        } else {
            viewQk0 = null;
        }
        if (view == viewQk0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0HZQ c0hzq3 = this.LLJJLIIIJLLLLLLLZ;
            if (c0hzq3 != null && c0hzq3.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (c0hzq2 = this.LLJJLIIIJLLLLLLLZ) != null) {
                C786410Ut5.LLLLLZ(c0hzq2, 8);
            }
        } else {
            z2 = false;
        }
        if (z2) {
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
            view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        View viewFindViewById = view.findViewById(R.id.video_play_icon);
        if (viewFindViewById != null && viewFindViewById.getVisibility() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        if (ip(view)) {
            int width2 = view.getWidth();
            int height = view.getHeight();
            if (width2 > 0 && height > 0) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width2, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
                for (int i = 0; i < 2; i++) {
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width2, height, Bitmap.Config.ARGB_8888);
                        try {
                            try {
                                C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), view);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                bitmapCreateBitmap.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                                throw th;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        bitmapCreateBitmap.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            }
        }
        try {
            c098200Yq = C0H9N.LIZ(view);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Bitmap bitmap = (Bitmap) c098200Yq;
        if (z3 && viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        if (z2 && (c0hzq = this.LLJJLIIIJLLLLLLLZ) != null) {
            C786410Ut5.LLLLLZ(c0hzq, 0);
        }
        if (z && bitmap != null && bitmap.getWidth() > 0) {
            TakoCardAbility takoCardAbilityHp2 = hp();
            if (takoCardAbilityHp2 != null) {
                viewGroupY4 = takoCardAbilityHp2.Y4();
            } else {
                viewGroupY4 = null;
            }
            View viewFindViewById2 = view.findViewById(R.id.kd6);
            if (viewFindViewById2 != null && viewFindViewById2.getVisibility() == 0 && viewFindViewById2.getWidth() > 0) {
                left = viewFindViewById2.getLeft();
            } else {
                left = Integer.MAX_VALUE;
            }
            if (viewGroupY4 != null && viewGroupY4.getVisibility() == 0 && viewGroupY4.getWidth() > 0) {
                left2 = viewGroupY4.getLeft();
            } else {
                left2 = Integer.MAX_VALUE;
            }
            Integer numValueOf = Integer.valueOf(Math.min(left, left2));
            if (numValueOf.intValue() != Integer.MAX_VALUE) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            if (viewFindViewById2 != null && viewFindViewById2.getVisibility() == 0 && viewFindViewById2.getWidth() > 0) {
                right = viewFindViewById2.getRight();
            } else {
                right = 0;
            }
            if (viewGroupY4 != null && viewGroupY4.getVisibility() == 0 && viewGroupY4.getWidth() > 0) {
                right2 = viewGroupY4.getRight();
            } else {
                right2 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(Math.max(right, right2));
            if (numValueOf2.intValue() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                width = numValueOf2.intValue();
            } else {
                width = bitmap.getWidth();
            }
            int iLJ = C13LZ.LJ(width - iIntValue, 1, bitmap.getWidth() - iIntValue);
            if (iIntValue > 0 || width < bitmap.getWidth()) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, iIntValue, 0, iLJ, bitmap.getHeight());
                if (bitmapCreateBitmap2 != bitmap) {
                    bitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                }
                return bitmapCreateBitmap2;
            }
        }
        return bitmap;
    }

    public final void dp(C326880Cre c326880Cre) {
        if (ep().LL.get(c326880Cre.LLILLL.msgId) != null) {
            C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
            if (C1857420yR2.LJJIIZ(C1558520qew.LJIIL(this), c326880Cre.LLILLL)) {
                Message message = c326880Cre.LLILLL;
                if (C1858670yT3.LJIIJ(message) && !C1004300cF2.LIZJ(message.LJIIIZ(), message.serverTime)) {
                    ep().yQ2(Collections.singletonList(c326880Cre), true);
                    ep().vQ2(false, c326880Cre);
                    return;
                }
                return;
            }
            ep().vQ2(false, c326880Cre);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM;
        this.LLJJLIIIJLLLLLLLZ = (C0HZQ) view.findViewById(R.id.umx);
        if (view.getParent() instanceof ViewGroup) {
            this.LLJL = op((ViewGroup) view.getParent());
            ((ViewGroup) view.getParent()).addView(this.LLJL);
        }
        view.bringToFront();
        if (view.getParent() instanceof ViewGroup) {
            this.LLJLIL = op((ViewGroup) view.getParent());
            ((ViewGroup) view.getParent()).addView(this.LLJLIL);
        }
        C0HZQ c0hzq = this.LLJJLIIIJLLLLLLLZ;
        if (c0hzq != null) {
            C0DSB.LIZIZ(c0hzq);
        }
        View view2 = this.LLJL;
        if (view2 != null) {
            C0DSB.LIZIZ(view2);
        }
        View view3 = this.LLJLIL;
        if (view3 != null) {
            C0DSB.LIZIZ(view3);
        }
        ep().GQ2(new AwS609S0100000_30(this, 102));
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLJJL.getValue();
        if (takoChatUIAbility != null) {
            viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM();
        } else {
            viewOnAttachStateChangeListenerC20604515jvCM = null;
        }
        this.LLJLL = viewOnAttachStateChangeListenerC20604515jvCM;
        if (viewOnAttachStateChangeListenerC20604515jvCM != null) {
            viewOnAttachStateChangeListenerC20604515jvCM.addOnScrollListener(this.LLJLLL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        TakoMixFeed takoMixFeedLJIIIZ;
        Long l;
        TakoMixFeed takoMixFeedLJIIIZ2;
        List<BaseVideo> list;
        BaseVideo baseVideo;
        ITEM item = (ITEM) obj;
        this.LLJZIJLIL = item;
        if (item instanceof InterfaceC1861810yY7) {
            boolean zBooleanValue = ep().getState().LL.LIZ.booleanValue();
            InterfaceC1861810yY7 interfaceC1861810yY7 = (InterfaceC1861810yY7) item;
            C326880Cre c326880CreLJJJJZI = interfaceC1861810yY7.LJJJJZI();
            if (zBooleanValue) {
                if (!AnonymousClass1418.LJFF(c326880CreLJJJJZI.LLILLL.LJIIIZ()) && ((takoMixFeedLJIIIZ = c326880CreLJJJJZI.LLILLL.LJIIIZ()) == null || takoMixFeedLJIIIZ.cardType != 52)) {
                    TakoMixFeed takoMixFeedLJIIIZ3 = c326880CreLJJJJZI.LLILLL.LJIIIZ();
                    if (takoMixFeedLJIIIZ3 != null && (list = takoMixFeedLJIIIZ3.videos) != null && (baseVideo = (BaseVideo) C13LP.LJJJLL(list)) != null) {
                        l = baseVideo.expireTime;
                    } else {
                        l = null;
                    }
                    if (!C1004300cF2.LIZIZ(l) && ((takoMixFeedLJIIIZ2 = c326880CreLJJJJZI.LLILLL.LJIIIZ()) == null || !AnonymousClass1418.LJI(takoMixFeedLJIIIZ2))) {
                        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
                        if (C1857420yR2.LJJIIZ(C1558520qew.LJIIL(this), c326880CreLJJJJZI.LLILLL)) {
                            C0HZQ c0hzq = this.LLJJLIIIJLLLLLLLZ;
                            if (c0hzq != null) {
                                C0DSB.LIZJ(c0hzq);
                            }
                            View view = this.LLJL;
                            if (view != null) {
                                C0DSB.LIZJ(view);
                            }
                            View view2 = this.LLJLIL;
                            if (view2 != null) {
                                C0DSB.LIZJ(view2);
                            }
                            boolean zKp = kp();
                            C0HZQ c0hzq2 = this.LLJJLIIIJLLLLLLLZ;
                            if (c0hzq2 != null) {
                                c0hzq2.setEnabled(zKp);
                            }
                            lp();
                        }
                    }
                }
            } else {
                C0HZQ c0hzq3 = this.LLJJLIIIJLLLLLLLZ;
                if (c0hzq3 != null) {
                    C0DSB.LIZIZ(c0hzq3);
                }
                View view3 = this.LLJL;
                if (view3 != null) {
                    C0DSB.LIZIZ(view3);
                }
                View view4 = this.LLJLIL;
                if (view4 != null) {
                    C0DSB.LIZIZ(view4);
                }
            }
            dp(interfaceC1861810yY7.LJJJJZI());
            C0HZQ c0hzq4 = this.LLJJLIIIJLLLLLLLZ;
            if (c0hzq4 != null) {
                c0hzq4.setChecked(ep().zQ2(interfaceC1861810yY7.LJJJJZI()));
            }
            View view5 = this.LLJL;
            if (view5 != null) {
                view5.setBackground(null);
            }
            View view6 = this.LLJLIL;
            if (view6 != null) {
                view6.setOnTouchListener(new ATListenerS349S0200000_30(this, item, 0));
                return;
            }
            return;
        }
        C0HZQ c0hzq5 = this.LLJJLIIIJLLLLLLLZ;
        if (c0hzq5 == null) {
            return;
        }
        C0DSB.LIZIZ(c0hzq5);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
