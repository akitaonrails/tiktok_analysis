package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.assem;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C019F;
import X.C0HTI;
import X.C0KFD;
import X.C1217570hn1;
import X.C1217630hn7;
import X.C13LE;
import X.C14JJ;
import X.C1637806bA;
import X.C1734450vEh;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C520010KaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.assem.PcsFormContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.PcsFormFieldsListCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.PcsFormHeadlineCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.PcsFormPrivacyPolicyCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import u4.q0;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsFormContentAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public ConstraintLayout LLJJIJI;
    public LiveIconView LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsFormContentAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/form/vm/PcsFormVm;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsFormContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsFormVm.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217570hn1(c19719912DlLIZ), new C1217630hn7(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyk;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC21674919sB abstractC21674919sB;
        super.onViewCreated(view);
        this.LLJJIII = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.q6o);
        this.LLJJIJI = (ConstraintLayout) view.findViewById(R.id.whk);
        this.LLJJIJIIJIL = (LiveIconView) view.findViewById(R.id.whm);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        Drawable drawableLIZ = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
            if (iHostCreativeTool != null && iHostCreativeTool.UC0()) {
                viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            }
            AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jv.getItemAnimator();
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = false;
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PcsFormHeadlineCell.class, PcsFormFieldsListCell.class, PcsFormPrivacyPolicyCell.class);
        }
        Context context = getContext();
        if (context != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.mr;
            drawableLIZ = c0hti.LIZ(context);
        }
        LiveIconView liveIconView = this.LLJJIJIIJIL;
        if (liveIconView != null) {
            liveIconView.setIcon(drawableLIZ);
        }
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.setClipToPadding(false);
            q0.LJJII(viewOnAttachStateChangeListenerC20604515jv3, new C14JJ() { // from class: X.0lmK
                @Override // X.C14JJ
                public final void LIZ(C14JM c14jm) {
                    int paddingBottom;
                    float f;
                    Resources resources;
                    DisplayMetrics displayMetrics;
                    PcsFormContentAssem pcsFormContentAssem = this;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = viewOnAttachStateChangeListenerC20604515jv3;
                    pcsFormContentAssem.getClass();
                    View viewFindFocus = viewOnAttachStateChangeListenerC20604515jv4.findFocus();
                    if (viewFindFocus != null && (paddingBottom = viewOnAttachStateChangeListenerC20604515jv4.getPaddingBottom()) != 0) {
                        Rect rect = new Rect();
                        viewFindFocus.getDrawingRect(rect);
                        viewOnAttachStateChangeListenerC20604515jv4.offsetDescendantRectToMyCoords(viewFindFocus, rect);
                        int height = rect.bottom - (viewOnAttachStateChangeListenerC20604515jv4.getHeight() - paddingBottom);
                        if (height > 0) {
                            float f2 = 16;
                            Context context2 = pcsFormContentAssem.getContext();
                            if (context2 != null && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                                f = displayMetrics.density;
                            } else {
                                f = 1.0f;
                            }
                            viewOnAttachStateChangeListenerC20604515jv4.smoothScrollBy(0, height + ((int) (f2 * f)));
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // X.C14JJ
                public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                    int i = c20246014Ju.LIZ(8).LIZLLL;
                    int i2 = c20246014Ju.LIZ(2).LIZLLL;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = viewOnAttachStateChangeListenerC20604515jv3;
                    int i3 = i - i2;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    viewOnAttachStateChangeListenerC20604515jv4.setPadding(viewOnAttachStateChangeListenerC20604515jv4.getPaddingLeft(), viewOnAttachStateChangeListenerC20604515jv4.getPaddingTop(), viewOnAttachStateChangeListenerC20604515jv4.getPaddingRight(), i3);
                    return c20246014Ju;
                }
            });
            if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
                final Rect rect = new Rect();
                final GestureDetector gestureDetector = new GestureDetector(viewOnAttachStateChangeListenerC20604515jv3.getContext(), new GestureDetector.SimpleOnGestureListener(this, rect) { // from class: X.0vCm
                    public final /* synthetic */ Rect LLILLJJLI;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onSingleTapUp(MotionEvent motionEvent) {
                        View view2;
                        final View viewFindFocus = this.LL.findFocus();
                        if (viewFindFocus instanceof EditText) {
                            ViewParent parent = viewFindFocus.getParent();
                            while (true) {
                                if (parent == 0) {
                                    break;
                                }
                                if (parent instanceof C1748440vbG) {
                                    view2 = (View) parent;
                                    if (view2 == null) {
                                        break;
                                    }
                                } else {
                                    parent = parent.getParent();
                                }
                            }
                            view2 = viewFindFocus;
                            view2.getGlobalVisibleRect(this.LLILLJJLI);
                            if (!this.LLILLJJLI.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                                final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LL;
                                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv4, new Runnable() { // from class: X.0v3J
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("PcsFormContentAssem@f435.setupDismissKeyboardOnTouchOutside$gestureDetector$1$onSingleTapUp$1");
                                        try {
                                            View viewFindFocus2 = viewOnAttachStateChangeListenerC20604515jv4.findFocus();
                                            View view3 = viewFindFocus;
                                            if (viewFindFocus2 == view3) {
                                                C1727140v2u.LIZ(view3);
                                            }
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("PcsFormContentAssem@f435.setupDismissKeyboardOnTouchOutside$gestureDetector$1$onSingleTapUp$1");
                                    }
                                });
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }

                    {
                        this.LLILLJJLI = rect;
                    }
                });
                viewOnAttachStateChangeListenerC20604515jv3.addOnItemTouchListener(new C0KFD() { // from class: X.0lQC
                    @Override // X.InterfaceC21676019sM
                    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                        gestureDetector.onTouchEvent(motionEvent);
                        return false;
                    }
                });
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0vEa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1734460vEi) obj).LLILLL;
            }
        }, null, new C1734450vEh(this), 6);
    }
}
