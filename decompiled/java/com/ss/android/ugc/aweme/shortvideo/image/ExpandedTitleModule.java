package com.ss.android.ugc.aweme.shortvideo.image;

import X.AbstractC21673619ry;
import X.AnonymousClass1971;
import X.C01GW;
import X.C0AKM;
import X.C0LAB;
import X.C0WZX;
import X.C0ZI0;
import X.C12ES;
import X.C12WG;
import X.C1318700kQ8;
import X.C1326880kdK;
import X.C1326890kdL;
import X.C1390380mHk;
import X.C1411690mq7;
import X.C1428310nGv;
import X.C1428470nHB;
import X.C1443400nfG;
import X.C19366310ph;
import X.C1954807lC;
import X.C196R;
import X.C196S;
import X.C197039127h;
import X.C19EG;
import X.C201955140j;
import X.C214856196o;
import X.C214857196p;
import X.C214864196w;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2341909Fp;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C830690WiJ;
import X.C855980Xi0;
import X.C856460Xim;
import X.C859330XnP;
import X.C890640Ywo;
import X.C995240c0Q;
import X.EnumC19366210pg;
import X.InterfaceC214858196q;
import X.InterfaceC2342209Fs;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ALAdapterS24S0100000_29;
import Y.ARunnableS114S0100000_14;
import Y.ARunnableS129S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ObjectAnimator;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageUiBusinessData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.airewrite.AIRewriteModule;
import com.ss.android.ugc.aweme.shortvideo.image.desc.DescIdeasModule;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import java.util.List;
import lth.o;

/* JADX INFO: loaded from: classes33.dex */
public final class ExpandedTitleModule implements C196R, InterfaceC214858196q, GenericLifecycleObserver {
    public final Scene LL;
    public VideoPublishEditModel LLILLJJLI;
    public final ViewGroup LLILLL;
    public final View LLILZ;
    public final C19EG LLILZIL;
    public final C1326880kdK LLILZLL;
    public final View LLIZ;
    public final C1326890kdL LLIZLLLIL;
    public final int LLJ;
    public final ViewGroup LLJI;
    public final View LLJIJIL;
    public final EditText LLJILJIL;
    public final TextView LLJILJILJ;
    public final C0ZI0 LLJILLL;
    public final C197039127h LLJJ;
    public final TuxIconView LLJJI;
    public final ViewGroup LLJJIII;
    public final TuxTextView LLJJIJI;
    public final View LLJJIJIIJIL;
    public final TextView LLJJIJIL;
    public final ViewGroup LLJJJ;
    public final ViewGroup LLJJJIL;
    public final TuxTextView LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C1318700kQ8 LLJJJJLIIL;
    public final View LLJJL;
    public final View LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public final int LLJLLL;
    public int LLJZ;
    public final boolean LLJZIJLIL;
    public final long LLL;
    public final int LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public boolean LLLIIIL;
    public final SafeHandler LLLIIL;
    public final int LLLIILIL;
    public final ViewGroup LLLIL;
    public final ViewGroup LLLILZ;
    public final ViewGroup LLLILZJ;
    public final ViewGroup LLLILZLLLI;
    public final TuxTextView LLLIZZ;
    public final TuxTextView LLLJ;
    public final TuxTextView LLLJIL;
    public final View LLLJL;
    public final View LLLL;
    public final TuxTextView LLLLII;
    public final View LLLLIIIILLL;
    public final View LLLLIIL;
    public final AnonymousClass1971 LLLLIILL;
    public final DescIdeasModule LLLLIILLL;
    public final View LLLLIL;
    public final RecyclerView LLLLILI;
    public final RecyclerView LLLLJ;
    public final View LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public final C01GW LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public final C01GW LLLLLJLJLL;
    public String LLLLLL;
    public final C197039127h LLLLLLIL;
    public final C01GW LLLLLLJ;
    public final C01GW LLLLLLL;
    public boolean LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public final InputMethodManager LLLLLLZ;
    public final SoftKeyBoardListener LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public final ExpandTextViewModel LLLLLZL;
    public final C01GW LLLLZ;
    public int LLLLZI;
    public int LLLLZIL;
    public EnumC19366210pg LLLLZLL;
    public int LLLLZLLIL;
    public boolean LLLLZLLLI;
    public final C214864196w LLLZ;
    public final ARunnableS114S0100000_14 LLLZI;
    public int LLLZIIL;
    public final C214857196p LLLZIL;
    public int LLLZL;
    public int LLLZLL;
    public int LLLZLZ;

    @Override // X.InterfaceC214858196q
    public final void LJ() {
        LJIJJ(3, true);
    }

    @Override // X.InterfaceC214858196q
    public final boolean LJII(int i) {
        return i == 1;
    }

    @Override // X.InterfaceC214858196q
    public final void LJIIL() {
        LJIJJ(1, true);
    }

    public final boolean LJJIJ() {
        ViewGroup[] viewGroupArr = {this.LLLIL, this.LLLILZ};
        int i = 0;
        do {
            ViewGroup viewGroup = viewGroupArr[i];
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                return true;
            }
            i++;
        } while (i < 2);
        return false;
    }

    public final void LJJJ() {
        this.LLLFFI = false;
        int i = C19366310ph.LIZ[this.LLLLZLL.ordinal()];
        if (i == 1) {
            this.LLJILJIL.requestFocus();
            LJJJJI();
        } else if (i == 2) {
            this.LLJILLL.requestFocus();
            LJJJJI();
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            LJJJJI();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LLLIIII = 0;
        this.LLLLLZ = false;
        this.LLLLZLLIL = 3;
        this.LLLLLLZZ.LLILLL = 0;
        if (LJJIJIIJI()) {
            C12WG.LIZLLL(this.LL, new ARunnableS129S0100000_29(this, 85), 200L);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    @Override // X.InterfaceC214858196q
    public final void LIZ() {
        C786410Ut5.LJLLLLLL(8, this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.InterfaceC214858196q
    public final int LIZIZ() {
        int i = this.LLJLIL;
        if (i > 0) {
            return i;
        }
        if (this.LLILZLL.getHeight() > 0) {
            return this.LLILZLL.getHeight();
        }
        int i2 = this.LLJ;
        int i3 = C196S.LLJJJJ;
        return i2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    }

    @Override // X.InterfaceC214858196q
    public final void LJFF() {
        this.LLJILLL.requestFocus();
        LJJJJI();
    }

    @Override // X.InterfaceC214858196q
    public final int LJI() {
        return this.LLILZLL.getLayoutParams().height;
    }

    @Override // X.InterfaceC214858196q
    public final int LJIILLIIL() {
        Integer numValueOf = Integer.valueOf(this.LLLZL);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)) - (numValueOf.intValue() >= 0 ? numValueOf.intValue() : this.LLJJIJIIJIL.getLayoutParams().height);
        if (iLIZIZ >= 0) {
            return iLIZIZ;
        }
        return 0;
    }

    @Override // X.InterfaceC214858196q
    public final int LJIIZILJ() {
        return this.LLJILLL.getMinHeight();
    }

    public final void LJIJI() {
        this.LLLZLL = this.LLILZLL.getHeight();
        C214857196p c214857196p = this.LLLZIL;
        if (c214857196p.LIZLLL == null) {
            c214857196p.LJI = Integer.valueOf(c214857196p.LIZ.LJIIJJI());
            int iLJI = c214857196p.LIZ.LJI();
            int iLIZIZ = c214857196p.LIZ.LIZIZ();
            int iLJIIZILJ = c214857196p.LIZ.LJIIZILJ();
            Integer num = c214857196p.LJI;
            c214857196p.LIZLLL = new C214856196o(iLJI, iLIZIZ, iLJIIZILJ, num != null ? num.intValue() : c214857196p.LIZ.LJIIJJI(), c214857196p.LIZ.LIZJ());
        }
    }

    public final void LJJ() {
        C12WG.LIZLLL(this.LL, new ARunnableS129S0100000_29(this, 132), 200L);
    }

    public final void LJJI() {
        if (this.LLLLLZ) {
            LJJIFFI();
            return;
        }
        this.LLLLLZIL = true;
        LJJJJI();
        this.LLLIIIL = true;
        this.LLLIIL.removeCallbacks(this.LLLZI);
        this.LLLIIL.postDelayed(this.LLLZI, 3000L);
    }

    public final AIRewriteModule LJJII() {
        return (AIRewriteModule) this.LLLLLLJ.getValue();
    }

    public final String LJJIII() {
        return String.valueOf(C2204961BRm.p(this.LLJILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTLOLo1qaop7kO4eb/8yqaBPC5Iw==", null)));
    }

    public final boolean LJJIIJ() {
        return ((Boolean) this.LLLLLLL.getValue()).booleanValue();
    }

    public final boolean LJJIIJZLJL() {
        return ((Boolean) this.LLLLLJIL.getValue()).booleanValue();
    }

    public final String LJJIIZ() {
        return C2204961BRm.LLJILLL(this.LLJILJIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTLOLo1qaop7kO4eb/8yqaBPC5Iw==", null)).toString();
    }

    public final void LJJIIZI() {
        InputMethodManager inputMethodManager;
        if (this.LLILZIL.getCurrentFocus() == null || !this.LLLLLZ || (inputMethodManager = this.LLLLLLZ) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.LLJILLL.getWindowToken(), 0);
    }

    public final boolean LJJIJIIJI() {
        int i = this.LLLZIIL;
        return i == 2 || i == 3;
    }

    public final boolean LJJIJL() {
        if (!this.LLLLLLLLLL) {
            C19EG c19eg = this.LLILZIL;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder.messageRes(2131821471);
            C1390380mHk.LIZ(c19eg, 4011, creativeToastBuilder);
            return true;
        }
        if (this.LLLLLLLLL) {
            return false;
        }
        C19EG c19eg2 = this.LLILZIL;
        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
        C859330XnP.LIZ.getClass();
        creativeToastBuilder2.isCenterToast(C859330XnP.LIZ());
        creativeToastBuilder2.messageRes(2131844966);
        C1390380mHk.LIZ(c19eg2, 4011, creativeToastBuilder2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule.LJJIL():void");
    }

    public final void LJJIZ() {
        int iLJIL = LJIL(this.LLLZIIL);
        int iLJIJJLI = LJIJJLI(iLJIL);
        LJJJJJL(iLJIL);
        this.LLJILLL.setMinHeight(iLJIJJLI);
    }

    public final void LJJJI() {
        if (((Boolean) this.LLLLLILLIL.getValue()).booleanValue()) {
            if (!LJJIJIIJI()) {
                LJJ();
            } else if (!this.LLLLLZ) {
                this.LLLFFI = false;
                LJJ();
            }
            AIRewriteModule aIRewriteModuleLJJII = LJJII();
            aIRewriteModuleLJJII.LJ(false);
            aIRewriteModuleLJJII.LJIILJJIL();
            DescIdeasModule descIdeasModule = this.LLLLIILLL;
            descIdeasModule.getClass();
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isLoadingData = ");
            sbLIZ.append(descIdeasModule.LLJLIL);
            C201955140j.LJIILL(c830690WiJ, "Debug-F", C2188811AlT.LIZIZ(sbLIZ));
            if (descIdeasModule.LLJLIL) {
                descIdeasModule.LJIIJ(true, true);
            } else if (((C1411690mq7) descIdeasModule.LLJJJJJIL.getValue()).LIZLLL(descIdeasModule.LLILLJJLI, descIdeasModule.LJI(), descIdeasModule.LIZIZ()) || descIdeasModule.LJFF().getItemCount() == 0) {
                descIdeasModule.LJIIJ(true, true);
                descIdeasModule.LJIIL();
            } else {
                DescIdeasModule.LJIIIZ(descIdeasModule, true, true, 2);
            }
        }
        if (((Boolean) this.LLLLLJLJLL.getValue()).booleanValue()) {
            if (!LJJIJIIJI()) {
                LJIJJ(5, false);
            } else if (this.LLLLLZ) {
                this.LLLFZ = true;
                LJJIIZI();
            } else {
                this.LLLFFI = false;
                LJIJJ(5, false);
            }
            DescIdeasModule descIdeasModule2 = this.LLLLIILLL;
            if (descIdeasModule2.LLJLILLLLZIIL) {
                descIdeasModule2.LJIIJJI(true, false);
                descIdeasModule2.LLJLILLLLZIIL = false;
                return;
            }
            if (descIdeasModule2.LLJLIL) {
                descIdeasModule2.LJ().LLLFZ();
                descIdeasModule2.LJIIJJI(true, false);
            } else {
                if (!((C1411690mq7) descIdeasModule2.LLJJJJJIL.getValue()).LIZLLL(descIdeasModule2.LLILLJJLI, descIdeasModule2.LJI(), descIdeasModule2.LIZIZ()) && descIdeasModule2.LJ().getItemCount() != 0) {
                    descIdeasModule2.LJIIJJI(true, true);
                    return;
                }
                descIdeasModule2.LJ().LLLFZ();
                descIdeasModule2.LJIIJJI(true, false);
                descIdeasModule2.LJIIL();
            }
        }
    }

    public final boolean LJJJJI() {
        if (this.LLLZIL.LIZIZ) {
            return false;
        }
        EditText editText = this.LLJILJIL.hasFocus() ? this.LLJILJIL : this.LLJILLL;
        editText.requestFocus();
        InputMethodManager inputMethodManager = this.LLLLLLZ;
        return inputMethodManager != null && inputMethodManager.showSoftInput(editText, 1);
    }

    public final void LJJJJIZL() {
        ImageUiBusinessData imageUiBusinessData;
        String heading;
        if (((this.LLJZIJLIL || !((heading = this.LLILLJJLI.getHeading()) == null || heading.length() == 0)) && this.LLJIJIL.getVisibility() == 8) || ((Boolean) C0AKM.LIZ.getValue()).booleanValue()) {
            C786410Ut5.LJLLLLLL(0, this.LLJIJIL);
            ImageAlbumData imageAlbumData = this.LLILLJJLI.getImageAlbumData();
            if (imageAlbumData == null || (imageUiBusinessData = imageAlbumData.getImageUiBusinessData()) == null) {
                return;
            }
            imageUiBusinessData.setHasShowedTitle(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        this.LLLLLLZZ.LIZ();
    }

    public final void LJJIFFI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expandLayout: ");
        sbLIZ.append(LJJIJ() ? 3 : 2);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIJJ(LJJIJ() ? 3 : 2, false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (LJJIJIIJI()) {
            this.LLLFFI = true;
            LJJIIZI();
        }
        this.LLLLZLL = this.LLJILLL.hasFocus() ? EnumC19366210pg.TEXT : this.LLJILJIL.hasFocus() ? EnumC19366210pg.TITLE : EnumC19366210pg.NONE;
        this.LLJILLL.clearFocus();
        this.LLJILJIL.clearFocus();
    }

    @Override // X.InterfaceC214858196q
    public final boolean LIZJ() {
        return this.LLLLLZ;
    }

    @Override // X.InterfaceC214858196q
    public final int LJIIJJI() {
        return this.LLLZIIL;
    }

    @Override // X.InterfaceC214858196q
    public final void LJIILL() {
        LJJIZ();
    }

    @Override // X.InterfaceC214858196q
    public final void LIZLLL(int i) {
        int iIntValue;
        if (i > 0 && this.LLLZL < 0) {
            this.LLLZL = this.LLJJIJIIJIL.getLayoutParams().height;
        }
        Integer numValueOf = Integer.valueOf(this.LLLZL);
        int i2 = 0;
        if (numValueOf.intValue() >= 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = this.LLJJIJIIJIL.getLayoutParams().height;
        }
        if (i >= 0) {
            i2 = i;
        }
        int i3 = iIntValue + i2;
        if (this.LLJJIJIIJIL.getLayoutParams().height != i3) {
            this.LLJJIJIIJIL.getLayoutParams().height = i3;
            this.LLJJIJIIJIL.requestLayout();
            this.LLILLL.requestLayout();
        }
        if (i <= 0) {
            this.LLLZL = -1;
        }
    }

    @Override // X.InterfaceC214858196q
    public final void LJIIIZ(int i) {
        LJIJJ(i, true);
    }

    @Override // X.InterfaceC214858196q
    public final void LJIIJ(int i) {
        this.LLJILLL.setMinHeight(i);
    }

    @Override // X.InterfaceC214858196q
    public final void LJIILIIL(int i) {
        LJJJJJL(i);
    }

    @Override // X.InterfaceC214858196q
    public final void LJIILJJIL(boolean z) {
        this.LLLFFI = z;
    }

    @Override // X.C196R
    public final void LJIJ(int i) {
        this.LLJLL = i;
        LJJIL();
        if (C855980Xi0.LIZJ(this.LLILLJJLI)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) ((C856460Xim) this.LLJJJJJIL.getValue()).LIZIZ(this.LLJLL));
            this.LLJILLL.setHint(spannableStringBuilder);
        }
    }

    public final int LJIJJLI(int i) {
        int i2 = this.LLJLLL;
        View viewFindViewById = this.LLILLL.findViewById(R.id.kfr);
        int height = viewFindViewById.getHeight();
        if (height <= 0) {
            height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL))) + viewFindViewById.getPaddingTop() + viewFindViewById.getPaddingBottom();
        }
        int i3 = i - height;
        if (i2 < i3) {
            i2 = i3;
        }
        return i2 - this.LLLF;
    }

    public final int LJIL(int i) {
        int iLIZ;
        int iLIZ2;
        int i2;
        int i3;
        int iLIZ3 = C995240c0Q.LIZ(this.LLJJIJI);
        int iLIZIZ = 0;
        if (LJJIIJZLJL()) {
            iLIZ = C995240c0Q.LIZ(this.LLJJIJIL);
        } else {
            iLIZ = 0;
        }
        int i4 = iLIZ3 + iLIZ;
        int iMax = Math.max(C995240c0Q.LIZ(this.LLLLILI) + this.LLLZLZ, C995240c0Q.LIZ(this.LLLLIL));
        if (LJJIIJ()) {
            AIRewriteModule aIRewriteModuleLJJII = LJJII();
            iLIZ2 = C995240c0Q.LIZ(aIRewriteModuleLJJII.LLJJI);
            int[] iArr = {C995240c0Q.LIZ(aIRewriteModuleLJJII.LLJJJ), C995240c0Q.LIZ(aIRewriteModuleLJJII.LLJJJJLIIL), C995240c0Q.LIZ(aIRewriteModuleLJJII.LLJJIJIIJIL)};
            int i5 = 0;
            do {
                iLIZ2 = Math.max(iLIZ2, iArr[i5]);
                i5++;
            } while (i5 < 3);
        } else {
            iLIZ2 = 0;
        }
        int iMax2 = Math.max(i4, Math.max(iMax, iLIZ2));
        int i6 = this.LLJL;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return this.LLJLIL;
                    }
                    int i7 = this.LLLI;
                    RecyclerView recyclerView = this.LLLLJ;
                    if (recyclerView != null) {
                        iLIZIZ = C995240c0Q.LIZIZ(recyclerView);
                    }
                    i2 = i7 - iLIZIZ;
                } else {
                    i2 = this.LLLI;
                }
            } else {
                int i8 = this.LLLZIL.LIZJ;
                if (i8 > 0) {
                    return i8;
                }
                i3 = this.LLLII;
                iMax2 = this.LLLIILIL;
                return i3 - iMax2;
            }
        } else {
            i2 = this.LLLII;
        }
        i3 = i2 - i6;
        return i3 - iMax2;
    }

    public final void LJJIJIL(C890640Ywo c890640Ywo) {
        if (this.LLLZIL.LIZIZ) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.LLJJLIIIJLLLLLLLZ);
        if (LJJIJ()) {
            int i = this.LLLZIIL;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                LJJI();
                                if (LJJIJ()) {
                                    C786410Ut5.LJLLLLLL(0, this.LLJJLIIIJLLLLLLLZ);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C786410Ut5.LJLLLLLL(8, this.LLJJLIIIJLLLLLLLZ);
                        return;
                    }
                    C786410Ut5.LJLLLLLL(0, this.LLJJLIIIJLLLLLLLZ);
                    return;
                }
                LJIJJ(3, false);
                if (!LJJIJ()) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, this.LLJJLIIIJLLLLLLLZ);
                return;
            }
            this.LLJJJJLIIL.setForbidScroll(true);
            return;
        }
        int i2 = this.LLLZIIL;
        if (i2 != 1) {
            if (i2 != 3) {
                return;
            }
            LJIJJ(2, false);
            return;
        }
        this.LLJJJJLIIL.setForbidScroll(false);
    }

    public final void LJJJIL(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (LJJIIJZLJL()) {
            C1428310nGv.LJIIIIZZ(this.LLJJIJI, z);
            if (C855980Xi0.LIZ(this.LLILLJJLI)) {
                if (!z) {
                    C1428310nGv.LJIIIIZZ(this.LLJJIJIL, false);
                    C786410Ut5.wd(this.LLJJIJI, 0.0f);
                    this.LLJJJ.getLayoutParams().height = this.LLJLILLLLZIIL;
                    return;
                }
                if (this.LLJJIJIL.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && this.LLLLZI > 0) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJIJI, "translationY", 0.0f, -r2.getLayoutParams().height);
                    objectAnimatorOfFloat.setDuration(this.LLL);
                    objectAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 17));
                    objectAnimatorOfFloat.addListener(new ALAdapterS24S0100000_29(this, 9));
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    return;
                }
                if (this.LLLLZI != 0 || this.LLJJIJIL.getVisibility() != 0) {
                    return;
                }
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJJIJI, "translationY", -r2.getLayoutParams().height, 0.0f);
                objectAnimatorOfFloat2.setDuration(this.LLL);
                objectAnimatorOfFloat2.addUpdateListener(new AUListenerS277S0100000_29(this, 18));
                objectAnimatorOfFloat2.addListener(new ALAdapterS24S0100000_29(this, 10));
                C786410Ut5.Pd(objectAnimatorOfFloat2);
                return;
            }
            return;
        }
        if (!z || this.LLLLILI.getVisibility() == 0) {
            z3 = false;
        }
        C1428310nGv.LJIIIIZZ(this.LLJJIJI, z3);
    }

    public final void LJJJJ(boolean z) {
        RecyclerView recyclerView;
        AbstractC21673619ry adapter;
        if (z) {
            RecyclerView recyclerView2 = (RecyclerView) this.LLLLZ.getValue();
            if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null && adapter.getItemCount() > 0) {
                C786410Ut5.LLIZLLLIL(recyclerView2, 0);
                return;
            }
            return;
        }
        View view = (View) this.LLLLZ.getValue();
        if (view == null || view.getVisibility() != 0 || (recyclerView = (RecyclerView) this.LLLLZ.getValue()) == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(recyclerView, 4);
    }

    public final void LJJJJJ(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight;
        int measuredHeight2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (i == 1) {
            ViewGroup[] viewGroupArr = {this.LLLIL, this.LLLILZ};
            int i2 = 0;
            do {
                ViewGroup viewGroup = viewGroupArr[i2];
                if (viewGroup != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams2.topMargin = this.LLLFF;
                        marginLayoutParams2.bottomMargin = 0;
                        C786410Ut5.X5(marginLayoutParams2, viewGroup);
                        C1443400nfG.LJIIJ(viewGroup);
                    }
                }
                i2++;
            } while (i2 < 2);
            C1443400nfG.LJIIJ(this.LLLJ);
            C1443400nfG.LJIIJ(this.LLLJIL);
        } else {
            ViewGroup[] viewGroupArr2 = {this.LLLIL, this.LLLILZ};
            int i3 = 0;
            do {
                ViewGroup viewGroup2 = viewGroupArr2[i3];
                if (viewGroup2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        int iLJIL = LJIL(3) + ((int) C12ES.LIZJ(9.0f, this.LLILZIL));
                        marginLayoutParams.topMargin = iLJIL;
                        View view = this.LLLJL;
                        if (view != null) {
                            if (view.getVisibility() == 0) {
                                measuredHeight = this.LLLJL.getMeasuredHeight();
                            } else {
                                measuredHeight = 0;
                            }
                            View view2 = this.LLLL;
                            if (view2 != null) {
                                measuredHeight2 = view2.getMeasuredHeight();
                            } else {
                                measuredHeight2 = 0;
                            }
                            marginLayoutParams.topMargin = iLJIL + measuredHeight + measuredHeight2;
                        }
                        marginLayoutParams.bottomMargin = this.LLLIIII;
                        C786410Ut5.X5(marginLayoutParams, viewGroup2);
                        C1443400nfG.LIZ(viewGroup2);
                    }
                }
                i3++;
            } while (i3 < 2);
            C1443400nfG.LIZ(this.LLLJ);
            C1443400nfG.LIZ(this.LLLJIL);
        }
        this.LLLILZJ.setOnTouchListener(new View.OnTouchListener() { // from class: X.1972
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    public final void LJJJJJL(int i) {
        if (this.LLILZLL.getLayoutParams().height != i) {
            this.LLILZLL.getLayoutParams().height = i;
            this.LLJILLL.requestLayout();
        }
    }

    public final void LJJJJL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLIZLLLIL.getLayoutParams();
        if (marginLayoutParams.height != i) {
            marginLayoutParams.height = i;
            C1326890kdL c1326890kdL = this.LLIZLLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1326890kdL);
            c1326890kdL.setLayoutParams(marginLayoutParams);
            this.LLJILLL.requestLayout();
        }
    }

    @Override // X.InterfaceC214858196q
    public final int LJIIIIZZ(int i, int i2) {
        int height;
        if (this.LLLZIIL == 2) {
            Integer numValueOf = Integer.valueOf(this.LLLZLL);
            if (numValueOf.intValue() > 0) {
                height = numValueOf.intValue();
            } else {
                height = this.LLILZLL.getHeight();
            }
            i = height - i2;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023c  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, kotlin.jvm.internal.AFwS223S0000000_32] */
    /* JADX WARN: Type inference failed for: r3v36, types: [T, kotlin.jvm.internal.AwS576S0100000_32] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, kotlin.jvm.internal.AwS576S0100000_32] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(int r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule.LJIJJ(int, boolean):void");
    }

    public final void LJJIJIIJIL(boolean z, boolean z2) {
        Object objValueOf;
        String str;
        List<SingleImageData> imageList;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("shoot_way", this.LLILLJJLI.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LLILLJJLI));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LLILLJJLI));
        c0lab.LJ("creation_id", this.LLILLJJLI.getCreationId());
        c0lab.LJ("mix_type", "photo");
        c0lab.LIZ(1, "is_multi_content");
        ImageAlbumData imageAlbumData = this.LLILLJJLI.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            objValueOf = Integer.valueOf(imageList.size());
        } else {
            objValueOf = null;
        }
        c0lab.LIZLLL(objValueOf, "pic_cnt");
        if (z) {
            str = "zoom_in";
        } else {
            str = "zoom_out";
        }
        c0lab.LJ("to_status", str);
        c0lab.LIZ(z2 ? 1 : 0, "is_effective");
        c0lab.LJ("author_id", o.LJIIZILJ.getCurrentUserID());
        C2341909Fp.LIZ("click_full_screen_input_button", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(int r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule.LJJIJLIJ(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0603  */
    /* JADX WARN: Type inference failed for: r0v158, types: [X.196w] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1971] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExpandedTitleModule(com.bytedance.scene.Scene r40, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r41, android.view.ViewGroup r42, android.view.View r43) {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule.<init>(com.bytedance.scene.Scene, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.view.ViewGroup, android.view.View):void");
    }
}
