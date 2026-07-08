package com.ss.android.ugc.aweme.choosemusic.cutpanel;

import X.C08A4;
import X.C09JN;
import X.C0DXR;
import X.C0H4I;
import X.C0HZQ;
import X.C0TKM;
import X.C11S5;
import X.C12ES;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1390920mIc;
import X.C1399580mWa;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1458070o2v;
import X.C15JF;
import X.C15JK;
import X.C15JN;
import X.C15KF;
import X.C15LQ;
import X.C15LR;
import X.C15LT;
import X.C15LU;
import X.C15LY;
import X.C15LZ;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C16G0;
import X.C16G1;
import X.C16HE;
import X.C16HF;
import X.C16HJ;
import X.C1701940uOG;
import X.C19EG;
import X.C201955140j;
import X.C20498215Iu;
import X.C20502815Ko;
import X.C2188811AlT;
import X.C2286008xW;
import X.C2286308xZ;
import X.C339190DRl;
import X.C341940Daq;
import X.C389650FPn;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C746290TPf;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC19381710sB;
import X.InterfaceC1631620sYq;
import X.InterfaceC20503815Ky;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS165S0100000_31;
import Y.ARunnableS49S0110000_31;
import Y.ATListenerS463S0100000_31;
import Y.AfS101S0300000_3;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public final class CutMusicPanel extends Fragment implements C15JN {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgHELIOSLSg5OiYwZiY5PT8yJiAgZwwmPAg5OiYwGCQiLCM=";
    public C19EG LLILLJJLI;
    public TuxSheet LLILLL;
    public C1390920mIc LLILZ;
    public C15LR LLILZIL;
    public View LLILZLL;
    public TuxIconView LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxTextView LLJI;
    public int LLJIJIL;
    public List<Integer> LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public LinearLayout LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public C15JK LLLF;
    public boolean LLLFF;
    public C20502815Ko LLLFFI;
    public Function1<? super Boolean, Unit> LLLFZ;
    public InterfaceC20503815Ky LLLI;
    public boolean LLLII;
    public float LLLIIII;
    public long LLLIIIL;
    public long LLLIIL;
    public C746290TPf LLLIILIL;
    public boolean LLLIL;
    public TuxIconView LLLILZ;
    public TuxIconView LLLILZJ;
    public TuxTextView LLLILZLLLI;
    public C0HZQ LLLIZZ;
    public TuxTextView LLLJ;
    public TuxTextView LLLJIL;
    public TuxTextView LLLJL;
    public TuxTextView LLLL;
    public LinearLayout LLLLII;
    public boolean LLLLIIIILLL;
    public int LLLLIIL;
    public int LLLLIILL;
    public int LLLLIILLL;
    public Function1<? super Boolean, Unit> LLLLIL;
    public Function1<? super Boolean, Unit> LLLLILI;
    public boolean LLLLJ;
    public int LLLLJI;
    public int LL = 308;
    public int LLJILJIL = 10;
    public float LLJILJILJ = 0.005f;
    public int LLJILLL = 10;
    public final float LLJJ = 15000.0f;
    public final float LLJJI = 0.005f;
    public final float LLJJIII = 50.0f;
    public final double LLJJIJI = 48.0d;
    public final float LLJJIJIIJIL = 24.0f;
    public boolean LLLIIIIL = true;
    public final String LLLLL = "CutMusicPanel:";

    @Override // X.C15JN
    public final void Df() {
    }

    @Override // X.C15JN
    public final void GI() {
    }

    @Override // X.C15JN
    public final void JH(List<C15JF> list) {
    }

    @Override // X.C15JN
    public final void JI() {
    }

    @Override // X.C15JN
    public final void LB(int i, List list) {
    }

    @Override // X.C15JN
    public final void Na(String str) {
    }

    @Override // X.C15JN
    public final void Of() {
        this.LLLFF = false;
    }

    @Override // X.C15JN
    public final void Wr(List<MusicWaveBean> list) {
    }

    @Override // X.C15JN
    public final void h5(boolean z) {
    }

    @Override // X.C15JN
    public final void jz(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super List<C15JF>, Unit> interfaceC1631620sYq) {
    }

    @Override // X.C15JN
    public final void mL(String str) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
    }

    @Override // X.C15JN
    public final void xi() {
    }

    @Override // X.C15JN
    public final int Aw() {
        C15LR c15lr = this.LLILZIL;
        if (c15lr == null) {
            c15lr = null;
        }
        return c15lr.getMaxCntOnScreen();
    }

    @Override // X.C15JN
    public final boolean Et() {
        C0HZQ c0hzq;
        C0HZQ c0hzq2 = this.LLLIZZ;
        if ((c0hzq2 == null || c0hzq2.getVisibility() != 8) && (c0hzq = this.LLLIZZ) != null) {
            return c0hzq.isChecked();
        }
        return false;
    }

    public final void NR() {
        Function1<? super Boolean, Unit> function1;
        C0HZQ c0hzq = this.LLLIZZ;
        if (c0hzq != null && (function1 = this.LLLFZ) != null) {
            function1.invoke(Boolean.valueOf(c0hzq.isChecked()));
        }
        this.LLLII = false;
        TuxSheet tuxSheet = this.LLILLL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        C20498215Iu.LIZ = false;
        InterfaceC20503815Ky interfaceC20503815Ky = this.LLLI;
        if (interfaceC20503815Ky != null) {
            interfaceC20503815Ky.LIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment, X.C15JN
    public final View getView() {
        View view = this.LLILZLL;
        if (view == null) {
            return null;
        }
        return view;
    }

    public final void MR() {
        TuxSheet tuxSheet;
        C0HZQ c0hzq;
        C0HZQ c0hzq2;
        if (C1458070o2v.LJFF() && (((c0hzq = this.LLLIZZ) == null || this.LLLLJ != c0hzq.isChecked()) && (c0hzq2 = this.LLLIZZ) != null)) {
            c0hzq2.setChecked(this.LLLLJ);
        }
        this.LLLII = false;
        TuxSheet tuxSheet2 = this.LLILLL;
        if (tuxSheet2 != null && tuxSheet2.isAdded() && (tuxSheet = this.LLILLL) != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
        C20498215Iu.LIZ = true;
        InterfaceC20503815Ky interfaceC20503815Ky = this.LLLI;
        if (interfaceC20503815Ky != null) {
            interfaceC20503815Ky.LIZLLL();
        }
    }

    @Override // X.C15JN
    public final List<Integer> Wj() {
        return C13BV.INSTANCE;
    }

    @Override // X.C15JN
    public final void A8(C16HJ c16hj) {
        C1390920mIc c1390920mIc = this.LLILZ;
        if (c1390920mIc == null) {
            c1390920mIc = null;
        }
        c1390920mIc.LIZ.LLILLJJLI = c16hj;
    }

    @Override // X.C15JN
    public final void BJ(float f) {
        C15LR c15lr = this.LLILZIL;
        if (c15lr == null) {
            c15lr = null;
        }
        C15LQ cutMusicView = c15lr.getCutMusicView();
        cutMusicView.LLILZIL = (int) c15lr.LLILLL;
        cutMusicView.LLILLL = f;
        cutMusicView.requestLayout();
    }

    @Override // X.C15JN
    public final void C6(C20502815Ko c20502815Ko) {
        this.LLLFFI = c20502815Ko;
    }

    @Override // X.C15JN
    public final void LLLIIII(List<Integer> list) {
        this.LLJJIJIL = list;
    }

    @Override // X.C15JN
    public final void My(InterfaceC20503815Ky interfaceC20503815Ky) {
        this.LLLI = interfaceC20503815Ky;
    }

    @Override // X.C15JN
    public final void OJ(C15JK c15jk) {
        this.LLLF = c15jk;
    }

    public final void PR(boolean z) {
        if (z && this.LLLIL) {
            return;
        }
        this.LLLIL = false;
        C746290TPf c746290TPf = this.LLLIILIL;
        if (c746290TPf != null) {
            c746290TPf.LIZJ();
        }
    }

    @Override // X.C15JN
    public final void Qw(Function1<? super Boolean, Unit> function1) {
        this.LLLLIL = function1;
    }

    public final void SR(int i) {
        String strK4;
        this.LLJIJIL = i;
        int iLIZIZ = C814420VxA.LIZIZ(i / 1000.0f);
        int i2 = iLIZIZ % 60;
        int i3 = iLIZIZ / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            strK4 = C786410Ut5.k4(Locale.CHINA, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
        } else {
            strK4 = C786410Ut5.k4(Locale.CHINA, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
        }
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(strK4);
        }
        TuxTextView tuxTextView2 = this.LLLJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(strK4);
        }
    }

    @Override // X.C15JN
    public final void TM(Function1<? super Boolean, Unit> function1) {
        this.LLLFZ = function1;
    }

    public final void UR(int i) {
        int iIntValue;
        int width;
        View childAt;
        View childAt2;
        List<Integer> list = this.LLJJIJIL;
        int i2 = 0;
        if (list != null) {
            iIntValue = ((Number) ListProtector.get(list, i)).intValue();
        } else {
            iIntValue = 0;
        }
        float f = (iIntValue * 1.0f) / this.LLJILJIL;
        this.LLLIIII = f;
        fC(f, iIntValue);
        List<Integer> list2 = this.LLJJIJIL;
        if (list2 != null) {
            for (Integer num : list2) {
                int i3 = i2 + 1;
                C19EG c19eg = null;
                if (i2 >= 0) {
                    int iIntValue2 = num.intValue();
                    C15LR c15lr = this.LLILZIL;
                    if (c15lr == null) {
                        c15lr = null;
                    }
                    if (C08A4.LIZ(Integer.valueOf(c15lr.getCutMusicView().getWidth()))) {
                        C15LR c15lr2 = this.LLILZIL;
                        if (c15lr2 == null) {
                            c15lr2 = null;
                        }
                        width = c15lr2.getCutMusicView().getWidth();
                    } else {
                        width = (int) (this.LL * 13.95f);
                    }
                    C19EG c19eg2 = this.LLILLJJLI;
                    if (c19eg2 != null) {
                        c19eg = c19eg2;
                    }
                    if (C444960Hcc.LIZJ(c19eg)) {
                        LinearLayout linearLayout = this.LLJL;
                        if (linearLayout != null && (childAt2 = linearLayout.getChildAt(i2)) != null) {
                            C786410Ut5.Jc(childAt2, (((-1) * (((iIntValue2 / this.LLJILJIL) - this.LLLIIII) * width)) + (i2 * C341940Daq.LIZ(20.0d))) - C341940Daq.LIZ(40.0d));
                        }
                    } else {
                        LinearLayout linearLayout2 = this.LLJL;
                        if (linearLayout2 != null && (childAt = linearLayout2.getChildAt(i2)) != null) {
                            C786410Ut5.Jc(childAt, ((((iIntValue2 / this.LLJILJIL) - this.LLLIIII) * width) - (i2 * C341940Daq.LIZ(20.0d))) + C341940Daq.LIZ(40.0d));
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        SR(iIntValue);
        InterfaceC20503815Ky interfaceC20503815Ky = this.LLLI;
        if (interfaceC20503815Ky != null) {
            interfaceC20503815Ky.LJI(this.LLLIIII);
        }
    }

    @Override // X.C15JN
    public final void ec(float f) {
        C814420VxA.LIZ(((double) f) * 100.0d);
    }

    @Override // X.C15JN
    public final void o4(int i) {
        String string;
        this.LLLLJI = i;
        if (i == 0) {
            TuxTextView tuxTextView = this.LLLILZLLLI;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLLILZLLLI;
        if (tuxTextView2 == null) {
            return;
        }
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (i3 > 0) {
            string = tuxTextView2.getContext().getString(2131829779, String.valueOf(i3), String.valueOf(i4));
        } else {
            string = tuxTextView2.getContext().getString(2131829778, Integer.valueOf(i4));
        }
        TuxTextView tuxTextView3 = this.LLLILZLLLI;
        if (tuxTextView3 == null) {
            return;
        }
        tuxTextView3.setText(string);
    }

    @Override // X.C15JN
    public final void z3(Function1<? super Boolean, Unit> function1) {
        this.LLLLILI = function1;
    }

    @Override // X.C15JN
    public final void Au(boolean z, boolean z2) {
        this.LLLLJ = z;
        C0HZQ c0hzq = this.LLLIZZ;
        if (c0hzq != null) {
            HandlerHook.viewPost(c0hzq, new ARunnableS49S0110000_31(this, z, 1));
        }
        if (z && z2) {
            TuxTextView tuxTextView = this.LLLILZLLLI;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            TuxTextView tuxTextView2 = this.LLLJIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLLILZLLLI;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
            TuxTextView tuxTextView4 = this.LLLJIL;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
        }
        this.LLLLIIIILLL = z2;
    }

    public final void RR(C16G0 c16g0, int i) {
        C16G1 c16g1 = new C16G1(-1, i);
        c16g1.LIZJ = 48;
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg == null) {
            c19eg = null;
        }
        C746290TPf c746290TPf = new C746290TPf(c19eg);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c746290TPf);
        c746290TPf.setLayoutParams(c16g1);
        int iLJIIJ = (int) (((double) C12ES.LJIIJ(c746290TPf.getContext())) * 0.75d);
        int i2 = (int) (((double) i) * 0.5d);
        final int i3 = i2 / 2;
        c746290TPf.LLIZ = i3;
        C0DXR c0dxr = new C0DXR(i3, i3) { // from class: X.03Ie
            public final int LL;
            public final int LLILLJJLI;

            {
                this.LL = i3;
                this.LLILLJJLI = i3;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                AbstractC21673619ry adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    int itemCount = adapter.getItemCount();
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    if (childAdapterPosition == 0) {
                        rect.top = this.LL;
                        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    } else if (childAdapterPosition == itemCount - 1) {
                        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                        rect.bottom = this.LLILLJJLI;
                    } else {
                        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    }
                }
            }
        };
        RecyclerView recyclerView = c746290TPf.LL;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            layoutParams.width = iLJIIJ;
            layoutParams.height = i2;
            C786410Ut5.p6(recyclerView, layoutParams);
            recyclerView.addItemDecoration(c0dxr);
        }
        c746290TPf.setListener(new C0TKM() { // from class: X.15LW
            @Override // X.C0TKM
            public final void LIZ() {
                InterfaceC20503815Ky interfaceC20503815Ky = this.LIZ.LLLI;
                if (interfaceC20503815Ky != null) {
                    interfaceC20503815Ky.LIZJ();
                }
            }

            @Override // X.C0TKM
            public final void LIZIZ() {
                InterfaceC20503815Ky interfaceC20503815Ky = this.LIZ.LLLI;
                if (interfaceC20503815Ky != null) {
                    interfaceC20503815Ky.LJFF(r0.LLJIJIL);
                }
            }
        });
        c746290TPf.setInitStartTime(this.LLJIJIL);
        C20502815Ko c20502815Ko = this.LLLFFI;
        if (c20502815Ko != null) {
            c746290TPf.LLJ.LIZ(C2286008xW.LIZ(new C2286308xZ(c20502815Ko.LIZ, c20502815Ko.LIZIZ, c20502815Ko.LIZJ, 0L, 0L)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS101S0300000_3(c20502815Ko, c746290TPf, new ArrayList(), 2), new C09JN() { // from class: X.00NX
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("CutMusicLyricView@a198.loadLyricInfos$2");
                    C1C7U.LIZIZ("CutMusicLyricView@a198.loadLyricInfos$2");
                }
            }));
        }
        c16g0.addView(c746290TPf, 1);
        this.LLLIILIL = c746290TPf;
        int visibility = c746290TPf.getVisibility();
        c746290TPf.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c746290TPf);
    }

    @Override // X.C15JN
    public final void fC(final float f, int i) {
        SR(i);
        final C15LR c15lr = this.LLILZIL;
        if (c15lr == null) {
            c15lr = null;
        }
        c15lr.getClass();
        HandlerHook.viewPost(c15lr, new Runnable() { // from class: X.0H4K
            public final /* synthetic */ boolean LLILLL = false;

            public final void LIZ() {
                int startX = c15lr.getCutMusicView().getStartX();
                int viewWidth = (int) (c15lr.getCutMusicView().getViewWidth() * f);
                int width = (c15lr.getWidth() - c15lr.getPaddingStart()) - c15lr.getPaddingEnd();
                if (this.LLILLL && c15lr.getCutMusicView().getViewWidth() - viewWidth < width && width > 0) {
                    int viewWidth2 = c15lr.getCutMusicView().getViewWidth() + c15lr.getPaddingStart() + c15lr.getPaddingEnd();
                    c15lr.getLayoutParams();
                    C15LR c15lr2 = c15lr;
                    c15lr2.setPadding(c15lr2.getPaddingStart(), c15lr2.getPaddingTop(), viewWidth2, c15lr2.getPaddingBottom());
                }
                c15lr.scrollBy(viewWidth - startX, 0);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DmtCutMusicScrollView@44b5.startScrollPosition$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DmtCutMusicScrollView@44b5.startScrollPosition$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0128  */
    @Override // X.C15JN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pm(androidx.fragment.app.FragmentManager r18, java.util.List<java.lang.Integer> r19) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel.pm(androidx.fragment.app.FragmentManager, java.util.List):void");
    }

    public final MusicWaveBean OR(int i, int i2, MusicWaveBean musicWaveBean) {
        if (C1458070o2v.LJFF() && i <= i2) {
            int iAw = Aw();
            float f = (iAw - r0) / this.LL;
            MusicWaveBean musicWaveBean2 = new MusicWaveBean();
            musicWaveBean2.setMusicLength((long) (musicWaveBean.getMusicLength() * f));
            int i3 = (int) f;
            int length = (int) ((f - i3) * musicWaveBean.getMusicWavePointArray().length);
            ArrayList arrayList = new ArrayList();
            if (i3 > 0) {
                int i4 = 0;
                do {
                    float[] musicWavePointArray = musicWaveBean.getMusicWavePointArray();
                    float[] fArrCopyOf = Arrays.copyOf(musicWavePointArray, musicWavePointArray.length);
                    if (fArrCopyOf.length != 0) {
                        fArrCopyOf[0] = 0.1f;
                    }
                    arrayList.addAll(C13LQ.LJJLIL(fArrCopyOf));
                    i4++;
                } while (i4 < i3);
            }
            if (length > 0) {
                ArrayList arrayList2 = new ArrayList(C13LQ.LJJLIIIJJI(length, musicWaveBean.getMusicWavePointArray()));
                if (!arrayList2.isEmpty()) {
                    ListProtector.set(arrayList2, 0, Float.valueOf(0.1f));
                }
                arrayList.addAll(arrayList2);
            }
            musicWaveBean2.setMusicWavePointArray(C13LP.LLI(arrayList));
            return musicWaveBean2;
        }
        return null;
    }

    @Override // X.C15JN
    public final void bA(C19EG c19eg, LayoutInflater layoutInflater, ViewGroup viewGroup, EnumC19381710sB enumC19381710sB) {
        View viewTd;
        int i;
        C15LU c15lu;
        int iIntValue;
        View view;
        int iIntValue2;
        int iIntValue3;
        GradientDrawable.Orientation orientation;
        GradientDrawable.Orientation orientation2;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        C0HZQ c0hzq;
        Integer numLIZJ;
        this.LLILLJJLI = c19eg;
        if (C1458070o2v.LIZIZ()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.d33, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.d2z, viewGroup, false);
        }
        this.LLILZLL = viewTd;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        View view2 = this.LLILZLL;
        if (view2 == null) {
            view2 = null;
        }
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = view2;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(1);
        EnumC19381710sB enumC19381710sB2 = EnumC19381710sB.DARK;
        if (enumC19381710sB != enumC19381710sB2 && enumC19381710sB != EnumC19381710sB.CONST) {
            i = R.style.xm;
        } else {
            i = R.style.xz;
        }
        c1390920mIc.LIZLLL(i, false);
        this.LLILZ = c1390920mIc;
        C19EG c19eg2 = this.LLILLJJLI;
        if (c19eg2 == null) {
            c19eg2 = null;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e7, c19eg2);
        EnumC19381710sB enumC19381710sB3 = EnumC19381710sB.CONST;
        if (enumC19381710sB == enumC19381710sB3 && numLIZJ2 != null) {
            C1390920mIc c1390920mIc2 = this.LLILZ;
            if (c1390920mIc2 == null) {
                c1390920mIc2 = null;
            }
            c1390920mIc2.LIZ.LLJI = numLIZJ2;
        }
        View view3 = this.LLILZLL;
        if (view3 == null) {
            view3 = null;
        }
        this.LLJI = (TuxTextView) view3.findViewById(R.id.zgz);
        this.LLJJJ = (TuxTextView) view3.findViewById(R.id.zh2);
        this.LLJLIL = (LinearLayout) view3.findViewById(R.id.ump);
        this.LLJJJIL = (TuxTextView) view3.findViewById(R.id.tv_selected_tips);
        this.LLIZ = (TuxIconView) view3.findViewById(R.id.t1b);
        this.LLIZLLLIL = (TuxIconView) view3.findViewById(R.id.t1c);
        this.LLJ = (TuxIconView) view3.findViewById(R.id.t1d);
        this.LLJJJJ = (TuxTextView) view3.findViewById(R.id.tv_selected_tips_default);
        this.LLILZIL = (C15LR) view3.findViewById(R.id.fe_);
        this.LLJJL = (TuxTextView) view3.findViewById(R.id.zgx);
        this.LLJJJJJIL = (TuxTextView) view3.findViewById(R.id.zgv);
        this.LLJJJJLIIL = (TuxTextView) view3.findViewById(R.id.zgw);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view3.findViewById(R.id.zgy);
        this.LLJLILLLLZIIL = (LinearLayout) view3.findViewById(R.id.yfy);
        this.LLJLL = view3.findViewById(R.id.vys);
        EnumC19381710sB enumC19381710sB4 = EnumC19381710sB.WHITE;
        if (enumC19381710sB == enumC19381710sB4 && (numLIZJ = C1308910kAL.LIZJ(R.attr.zi, c19eg)) != null) {
            int iIntValue8 = numLIZJ.intValue();
            View view4 = this.LLJLL;
            if (view4 != null) {
                view4.setBackgroundColor(iIntValue8);
            }
        }
        this.LLJLLIL = view3.findViewById(R.id.feb);
        this.LLJLLL = view3.findViewById(R.id.fea);
        this.LLJZ = view3.findViewById(R.id.fe9);
        this.LLJL = (LinearLayout) view3.findViewById(R.id.ow8);
        this.LLJZIJLIL = view3.findViewById(R.id.fe6);
        this.LLL = view3.findViewById(R.id.fe7);
        if (C1458070o2v.LIZIZ()) {
            this.LLLILZ = (TuxIconView) view3.findViewById(R.id.fe3);
            this.LLLILZJ = (TuxIconView) view3.findViewById(R.id.fe4);
            this.LLLILZLLLI = (TuxTextView) view3.findViewById(R.id.nqt);
            this.LLLJ = (TuxTextView) view3.findViewById(R.id.dq5);
            this.LLLIZZ = (C0HZQ) view3.findViewById(R.id.dqf);
            this.LLLJIL = (TuxTextView) view3.findViewById(R.id.nqs);
            this.LLLJL = (TuxTextView) view3.findViewById(R.id.zh0);
            this.LLLL = (TuxTextView) view3.findViewById(R.id.zh3);
            this.LLLLII = (LinearLayout) view3.findViewById(R.id.yfz);
            LinearLayout linearLayout = this.LLJL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
        }
        View view5 = this.LLJZIJLIL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(8, view5);
        }
        C19EG c19eg3 = this.LLILLJJLI;
        if (c19eg3 == null) {
            c19eg3 = null;
        }
        C1361400lX0 c1361400lX0 = new C1361400lX0(c19eg3, R.style.y0);
        C19EG c19eg4 = this.LLILLJJLI;
        if (c19eg4 == null) {
            c19eg4 = null;
        }
        C1361400lX0 c1361400lX02 = new C1361400lX0(c19eg4, R.style.y3);
        int iIntValue9 = -1;
        if (enumC19381710sB == enumC19381710sB4) {
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLL();
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a02, c1361400lX02);
            if (numLIZJ3 != null) {
                iIntValue9 = numLIZJ3.intValue();
            }
            c15lu = new C15LU(R.color.ao, R.color.da, R.color.dg, R.color.f571dc, R.color.aj, R.color.da, R.attr.a1h, R.attr.a1p, R.attr.a1k, R.attr.a1h, R.attr.a1h, R.attr.a1h, iIntValue9);
        } else {
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a02, c1361400lX0);
            if (numLIZJ4 != null) {
                iIntValue9 = numLIZJ4.intValue();
            }
            c15lu = new C15LU(R.color.b8, R.color.f569bc, R.color.f569bc, R.color.be, R.color.b3, R.color.f569bc, R.attr.ee, R.attr.ei, R.attr.zl, R.attr.zi, R.attr.zi, R.attr.zi, iIntValue9);
        }
        C19EG c19eg5 = this.LLILLJJLI;
        if (c19eg5 == null) {
            c19eg5 = null;
        }
        int color = c19eg5.getResources().getColor(c15lu.LIZ);
        C19EG c19eg6 = this.LLILLJJLI;
        if (c19eg6 == null) {
            c19eg6 = null;
        }
        int color2 = c19eg6.getResources().getColor(c15lu.LIZLLL);
        C19EG c19eg7 = this.LLILLJJLI;
        if (c19eg7 == null) {
            c19eg7 = null;
        }
        Integer numLIZJ5 = C1308910kAL.LIZJ(c15lu.LJII, c19eg7);
        if (numLIZJ5 != null) {
            iIntValue = numLIZJ5.intValue();
        } else {
            iIntValue = color;
        }
        C19EG c19eg8 = this.LLILLJJLI;
        if (c19eg8 == null) {
            c19eg8 = null;
        }
        int color3 = c19eg8.getResources().getColor(c15lu.LIZIZ);
        if (enumC19381710sB == enumC19381710sB3) {
            C19EG c19eg9 = this.LLILLJJLI;
            if (c19eg9 == null) {
                c19eg9 = null;
            }
            Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.e7, c19eg9);
            if (numLIZJ6 != null) {
                color = numLIZJ6.intValue();
            }
            C19EG c19eg10 = this.LLILLJJLI;
            if (c19eg10 == null) {
                c19eg10 = null;
            }
            Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.eh, c19eg10);
            if (numLIZJ7 != null) {
                color2 = numLIZJ7.intValue();
            }
        }
        C19EG c19eg11 = this.LLILLJJLI;
        if (c19eg11 == null) {
            c19eg11 = null;
        }
        Resources resources = c19eg11.getResources();
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(resources.getColor(c15lu.LIZJ));
        }
        TuxTextView tuxTextView2 = this.LLJJJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(iIntValue);
        }
        TuxTextView tuxTextView3 = this.LLJJJJJIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(resources.getColor(c15lu.LIZIZ));
        }
        TuxTextView tuxTextView4 = this.LLJJL;
        if (tuxTextView4 != null) {
            tuxTextView4.setTextColor(resources.getColor(c15lu.LIZIZ));
        }
        TuxTextView tuxTextView5 = this.LLJJJJLIIL;
        if (tuxTextView5 != null) {
            tuxTextView5.setTextColor(resources.getColor(c15lu.LIZIZ));
        }
        TuxTextView tuxTextView6 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView6 != null) {
            tuxTextView6.setTextColor(resources.getColor(c15lu.LIZIZ));
        }
        TuxTextView tuxTextView7 = this.LLJJJIL;
        if (tuxTextView7 != null) {
            tuxTextView7.setTextColor(color3);
        }
        TuxTextView tuxTextView8 = this.LLJJJJ;
        if (tuxTextView8 != null) {
            tuxTextView8.setTextColor(color2);
        }
        View view6 = this.LLJLL;
        if (view6 != null) {
            view6.setBackgroundColor(resources.getColor(c15lu.LJFF));
        }
        resources.getColor(c15lu.LJ);
        View view7 = this.LLILZLL;
        if (view7 == null) {
            view7 = null;
        }
        view7.setBackgroundColor(resources.getColor(c15lu.LIZ));
        C15LR c15lr = this.LLILZIL;
        if (c15lr == null) {
            c15lr = null;
        }
        C19EG c19eg12 = this.LLILLJJLI;
        if (c19eg12 == null) {
            c19eg12 = null;
        }
        int iLIZ = C960203pA.LIZ(c15lu.LJI, c19eg12);
        int color4 = resources.getColor(R.color.ct);
        C15LQ cutMusicView = c15lr.getCutMusicView();
        cutMusicView.LLJIJIL = iLIZ;
        cutMusicView.LLILLJJLI.LIZ(iLIZ);
        cutMusicView.LLJI = color4;
        cutMusicView.LL.setColor(color4);
        cutMusicView.invalidate();
        if (C1458070o2v.LIZIZ()) {
            C19EG c19eg13 = this.LLILLJJLI;
            if (c19eg13 == null) {
                c19eg13 = null;
            }
            Integer numLIZJ8 = C1308910kAL.LIZJ(c15lu.LJIIIIZZ, c19eg13);
            if (numLIZJ8 != null) {
                iIntValue4 = numLIZJ8.intValue();
            } else {
                iIntValue4 = color;
            }
            C19EG c19eg14 = this.LLILLJJLI;
            if (c19eg14 == null) {
                c19eg14 = null;
            }
            Integer numLIZJ9 = C1308910kAL.LIZJ(c15lu.LJIIIZ, c19eg14);
            if (numLIZJ9 != null) {
                iIntValue5 = numLIZJ9.intValue();
            } else {
                iIntValue5 = color;
            }
            C19EG c19eg15 = this.LLILLJJLI;
            if (c19eg15 == null) {
                c19eg15 = null;
            }
            Integer numLIZJ10 = C1308910kAL.LIZJ(c15lu.LJIIJ, c19eg15);
            if (numLIZJ10 != null) {
                iIntValue6 = numLIZJ10.intValue();
            } else {
                iIntValue6 = color;
            }
            C19EG c19eg16 = this.LLILLJJLI;
            if (c19eg16 == null) {
                c19eg16 = null;
            }
            Integer numLIZJ11 = C1308910kAL.LIZJ(c15lu.LJIIJJI, c19eg16);
            if (numLIZJ11 != null) {
                iIntValue7 = numLIZJ11.intValue();
            } else {
                iIntValue7 = color;
            }
            TuxTextView tuxTextView9 = this.LLLILZLLLI;
            if (tuxTextView9 != null) {
                tuxTextView9.setTextColor(iIntValue4);
            }
            TuxTextView tuxTextView10 = this.LLLJIL;
            if (tuxTextView10 != null) {
                tuxTextView10.setTextColor(iIntValue4);
            }
            TuxTextView tuxTextView11 = this.LLLJ;
            if (tuxTextView11 != null) {
                tuxTextView11.setTextColor(iIntValue5);
            }
            TuxIconView tuxIconView = this.LLLILZ;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue6);
            }
            TuxIconView tuxIconView2 = this.LLLILZJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColor(iIntValue7);
            }
            TuxTextView tuxTextView12 = this.LLLJL;
            if (tuxTextView12 != null) {
                C19EG c19eg17 = this.LLILLJJLI;
                if (c19eg17 == null) {
                    c19eg17 = null;
                }
                tuxTextView12.setTextColor(c19eg17.getResources().getColor(c15lu.LIZJ));
            }
            TuxTextView tuxTextView13 = this.LLLL;
            if (tuxTextView13 != null) {
                tuxTextView13.setTextColor(iIntValue);
            }
            if (enumC19381710sB != enumC19381710sB4 && (c0hzq = this.LLLIZZ) != null) {
                c0hzq.setCheckBoxUncheckedColor(iIntValue4);
            }
            C15LR c15lr2 = this.LLILZIL;
            if (c15lr2 == null) {
                c15lr2 = null;
            }
            c15lr2.setLoopWaveColor(c15lu.LJIIL);
            C19EG c19eg18 = this.LLILLJJLI;
            if (c19eg18 == null) {
                c19eg18 = null;
            }
            this.LLLLIIL = C960203pA.LIZ(c15lu.LJI, c19eg18);
            this.LLLLIILL = c15lu.LJIIL;
        }
        int[] iArr = {color, 0};
        View view8 = this.LLJLLL;
        if (view8 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(iArr);
            gradientDrawable.setGradientType(0);
            C19EG c19eg19 = this.LLILLJJLI;
            if (c19eg19 == null) {
                c19eg19 = null;
            }
            if (C444960Hcc.LIZJ(c19eg19)) {
                orientation2 = GradientDrawable.Orientation.RIGHT_LEFT;
            } else {
                orientation2 = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            gradientDrawable.setOrientation(orientation2);
            view8.setBackground(gradientDrawable);
        }
        View view9 = this.LLJZ;
        if (view9 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColors(iArr);
            gradientDrawable2.setColors(new int[]{0, color});
            gradientDrawable2.setGradientType(0);
            C19EG c19eg20 = this.LLILLJJLI;
            if (c19eg20 == null) {
                c19eg20 = null;
            }
            if (C444960Hcc.LIZJ(c19eg20)) {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            } else {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            gradientDrawable2.setOrientation(orientation);
            view9.setBackground(gradientDrawable2);
        }
        int iIntValue10 = -3355444;
        if (enumC19381710sB == enumC19381710sB2) {
            C19EG c19eg21 = this.LLILLJJLI;
            if (c19eg21 == null) {
                c19eg21 = null;
            }
            if (C960203pA.LIZIZ(c19eg21) && (view = this.LLJLLIL) != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                if (!C1458070o2v.LIZIZ()) {
                    gradientDrawable3.setAlpha(20);
                    C19EG c19eg22 = this.LLILLJJLI;
                    if (c19eg22 == null) {
                        c19eg22 = null;
                    }
                    Integer numLIZJ12 = C1308910kAL.LIZJ(R.attr.a1h, c19eg22);
                    if (numLIZJ12 != null) {
                        iIntValue3 = numLIZJ12.intValue();
                    } else {
                        iIntValue3 = -3355444;
                    }
                    gradientDrawable3.setColor(iIntValue3);
                } else {
                    int iLIZ2 = (int) C339190DRl.LIZ(2);
                    C19EG c19eg23 = this.LLILLJJLI;
                    if (c19eg23 == null) {
                        c19eg23 = null;
                    }
                    Integer numLIZJ13 = C1308910kAL.LIZJ(R.attr.zl, c19eg23);
                    if (numLIZJ13 != null) {
                        iIntValue2 = numLIZJ13.intValue();
                    } else {
                        iIntValue2 = -3355444;
                    }
                    gradientDrawable3.setStroke(iLIZ2, iIntValue2);
                }
                gradientDrawable3.setCornerRadius(C418440Gaw.LIZIZ(12));
                view.setBackground(gradientDrawable3);
            }
        }
        if (enumC19381710sB == enumC19381710sB4) {
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLL();
            View view10 = this.LLJLLIL;
            if (view10 != null) {
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                if (!C1458070o2v.LIZIZ()) {
                    gradientDrawable4.setAlpha(20);
                    C19EG c19eg24 = this.LLILLJJLI;
                    if (c19eg24 == null) {
                        c19eg24 = null;
                    }
                    Integer numLIZJ14 = C1308910kAL.LIZJ(R.attr.a1h, c19eg24);
                    if (numLIZJ14 != null) {
                        iIntValue10 = numLIZJ14.intValue();
                    }
                    gradientDrawable4.setColor(iIntValue10);
                } else {
                    int iLIZ3 = (int) C339190DRl.LIZ(2);
                    C19EG c19eg25 = this.LLILLJJLI;
                    if (c19eg25 == null) {
                        c19eg25 = null;
                    }
                    Integer numLIZJ15 = C1308910kAL.LIZJ(R.attr.zd, c19eg25);
                    if (numLIZJ15 != null) {
                        iIntValue10 = numLIZJ15.intValue();
                    }
                    gradientDrawable4.setStroke(iLIZ3, iIntValue10);
                }
                gradientDrawable4.setShape(0);
                gradientDrawable4.setCornerRadius(C418440Gaw.LIZIZ(12));
                view10.setBackground(gradientDrawable4);
            }
        }
        View view11 = this.LLILZLL;
        if (view11 == null) {
            view11 = null;
        }
        view11.getBackground().setAlpha(30);
        View view12 = this.LLILZLL;
        if (view12 == null) {
            view12 = null;
        }
        view12.invalidate();
        C1390920mIc c1390920mIc3 = this.LLILZ;
        if (c1390920mIc3 == null) {
            c1390920mIc3 = null;
        }
        c1390920mIc3.LIZ.LL = new C16HF(this, 3);
        TuxIconView tuxIconView3 = this.LLLILZ;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS165S0100000_31(this, 168));
        }
        TuxIconView tuxIconView4 = this.LLLILZJ;
        if (tuxIconView4 != null) {
            C786410Ut5.a9(tuxIconView4, new ACListenerS165S0100000_31(this, 169));
        }
        TuxTextView tuxTextView14 = this.LLJJL;
        if (tuxTextView14 != null) {
            C786410Ut5.h9(tuxTextView14, new ACListenerS165S0100000_31(this, 170));
        }
        TuxTextView tuxTextView15 = this.LLJJJJJIL;
        if (tuxTextView15 != null) {
            C786410Ut5.h9(tuxTextView15, new ACListenerS165S0100000_31(this, 171));
        }
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLL();
        TuxTextView tuxTextView16 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView16 != null) {
            C786410Ut5.h9(tuxTextView16, new ACListenerS165S0100000_31(this, 172));
        }
        TuxTextView tuxTextView17 = this.LLJJJJLIIL;
        if (tuxTextView17 != null) {
            C786410Ut5.h9(tuxTextView17, new ACListenerS165S0100000_31(this, 173));
        }
        TuxIconView tuxIconView5 = this.LLIZ;
        if (tuxIconView5 != null) {
            C786410Ut5.a9(tuxIconView5, new ACListenerS165S0100000_31(this, 174));
        }
        TuxIconView tuxIconView6 = this.LLIZLLLIL;
        if (tuxIconView6 != null) {
            C786410Ut5.a9(tuxIconView6, new ACListenerS165S0100000_31(this, 175));
        }
        TuxIconView tuxIconView7 = this.LLJ;
        if (tuxIconView7 != null) {
            C786410Ut5.a9(tuxIconView7, new ACListenerS165S0100000_31(this, 166));
        }
        C15LR c15lr3 = this.LLILZIL;
        if (c15lr3 == null) {
            c15lr3 = null;
        }
        c15lr3.setOnScrollingListener(new C15LZ() { // from class: X.15LP
            /* JADX WARN: Removed duplicated region for block: B:69:0x015b  */
            @Override // X.C15LZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(float r18) {
                /*
                    Method dump skipped, instruction units count: 443
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C15LP.LIZ(float):void");
            }

            @Override // X.C15LZ
            public final void LIZIZ(float f) {
                int iLJ;
                C15JK c15jk;
                CutMusicPanel cutMusicPanel = this.LIZ;
                cutMusicPanel.LLLIIII = f;
                InterfaceC20503815Ky interfaceC20503815Ky = cutMusicPanel.LLLI;
                if (interfaceC20503815Ky != null) {
                    iLJ = interfaceC20503815Ky.LJ(f);
                } else {
                    iLJ = 0;
                }
                this.LIZ.SR(iLJ);
                InterfaceC20503815Ky interfaceC20503815Ky2 = this.LIZ.LLLI;
                if (interfaceC20503815Ky2 != null) {
                    interfaceC20503815Ky2.LJI(f);
                }
                C746290TPf c746290TPf = this.LIZ.LLLIILIL;
                if (c746290TPf != null && c746290TPf.getVisibility() == 0) {
                    c746290TPf.LIZ(iLJ, true);
                }
                CutMusicPanel cutMusicPanel2 = this.LIZ;
                List<Integer> list = cutMusicPanel2.LLJJIJIL;
                if (list != null) {
                    int i2 = 0;
                    for (Integer num : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            float fIntValue = num.intValue() / cutMusicPanel2.LLJILJIL;
                            float f2 = cutMusicPanel2.LLJILJILJ;
                            if (f <= fIntValue + f2 && f >= fIntValue - f2 && (c15jk = cutMusicPanel2.LLLF) != null) {
                                C15JJ.LIZ.getClass();
                                C15JJ.LJI(c15jk);
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                CutMusicPanel cutMusicPanel3 = this.LIZ;
                cutMusicPanel3.LLLIL = false;
                cutMusicPanel3.PR(false);
            }
        });
        C15LR c15lr4 = this.LLILZIL;
        if (c15lr4 == null) {
            c15lr4 = null;
        }
        c15lr4.setCutMusicTouchListener(new C15LY() { // from class: X.15LX
            @Override // X.C15LY
            public final void LIZJ() {
                this.LIZ.PR(true);
            }

            @Override // X.C15LY
            public final void LJI() {
                C746290TPf c746290TPf = this.LIZ.LLLIILIL;
                if (c746290TPf != null) {
                    c746290TPf.LIZIZ();
                }
                CutMusicPanel cutMusicPanel = this.LIZ;
                C746290TPf c746290TPf2 = cutMusicPanel.LLLIILIL;
                if (c746290TPf2 != null) {
                    int i2 = cutMusicPanel.LLJIJIL;
                    if (c746290TPf2.getVisibility() == 0) {
                        c746290TPf2.LIZ(i2, true);
                    }
                }
            }

            @Override // X.C15LY
            public final void onCancel() {
                this.LIZ.PR(false);
            }
        });
        if (C1458070o2v.LIZIZ()) {
            TuxTextView tuxTextView18 = this.LLLJ;
            if (tuxTextView18 != null) {
                C786410Ut5.h9(tuxTextView18, new ACListenerS165S0100000_31(this, 167));
            }
            C0HZQ c0hzq2 = this.LLLIZZ;
            if (c0hzq2 != null && c0hzq2.isChecked()) {
                C15LR c15lr5 = this.LLILZIL;
                if (c15lr5 == null) {
                    c15lr5 = null;
                }
                c15lr5.setLoopWaveColor(this.LLLLIIL);
                C15LR c15lr6 = this.LLILZIL;
                if (c15lr6 == null) {
                    c15lr6 = null;
                }
                c15lr6.getCutMusicView().LLILLJJLI.LJIILJJIL = true;
            } else {
                C15LR c15lr7 = this.LLILZIL;
                if (c15lr7 == null) {
                    c15lr7 = null;
                }
                c15lr7.setLoopWaveColor(this.LLLLIILL);
                C15LR c15lr8 = this.LLILZIL;
                if (c15lr8 == null) {
                    c15lr8 = null;
                }
                c15lr8.getCutMusicView().LLILLJJLI.LJIILJJIL = false;
            }
            C0HZQ c0hzq3 = this.LLLIZZ;
            if (c0hzq3 != null) {
                c0hzq3.setOnTouchListener(new ATListenerS463S0100000_31(this, 6));
            }
            C0HZQ c0hzq4 = this.LLLIZZ;
            if (c0hzq4 != null) {
                C786410Ut5.D7(c0hzq4, new C16HE(this, 11));
            }
        }
    }

    @Override // X.C15JN
    public final boolean rw(MusicWaveBean musicWaveBean, int i, int i2, int i3, int i4) {
        String string;
        int iAw;
        float[] musicWavePointArray;
        float[] musicWavePointArray2;
        String string2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAudioWaveViewData: musiclength ");
        sbLIZ.append(i);
        sbLIZ.append(", videolength ");
        sbLIZ.append(i3);
        sbLIZ.append(", wave:");
        sbLIZ.append(musicWaveBean);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i == 0 || i3 == 0 || musicWaveBean == null) {
            return false;
        }
        SR(0);
        C15LR c15lr = this.LLILZIL;
        C15LR c15lr2 = null;
        if (c15lr == null) {
            c15lr = null;
        }
        c15lr.scrollToPosition(0);
        c15lr.LLILLL = 0.0f;
        C15LQ cutMusicView = c15lr.getCutMusicView();
        cutMusicView.LLILZ = 0;
        C15LT c15lt = cutMusicView.LLILLJJLI;
        int i5 = cutMusicView.LLJ;
        c15lt.LJI = 0;
        c15lt.LJII = i5;
        cutMusicView.invalidate();
        this.LLJILJIL = i;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" / ");
        sbLIZ2.append(C389650FPn.LIZ(i));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        TuxTextView tuxTextView = this.LLJJJ;
        if (tuxTextView != null) {
            tuxTextView.setText(strLIZIZ);
        }
        TuxTextView tuxTextView2 = this.LLLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(strLIZIZ);
        }
        this.LLJILLL = i3;
        this.LLJILJILJ = (i3 * this.LLJJI) / this.LLJJ;
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg == null) {
            c19eg = null;
        }
        Resources resources = c19eg.getResources();
        int i6 = i3 / LSPassThroughRecordSizeConfig.DEFAULT;
        String string3 = resources.getString(2131848646, Integer.valueOf(i6));
        TuxTextView tuxTextView3 = this.LLJJJIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(string3);
        }
        TuxTextView tuxTextView4 = this.LLJJJJ;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(string3);
        }
        int i7 = this.LLJILJIL;
        if (i7 > this.LLJILLL) {
            int i8 = i6 / 60;
            int i9 = i6 % 60;
            TuxTextView tuxTextView5 = this.LLLJIL;
            if (tuxTextView5 != null) {
                if (i8 > 0) {
                    C19EG c19eg2 = this.LLILLJJLI;
                    if (c19eg2 == null) {
                        c19eg2 = null;
                    }
                    string2 = c19eg2.getResources().getString(2131829780, String.valueOf(i8), String.valueOf(i9));
                } else {
                    C19EG c19eg3 = this.LLILLJJLI;
                    if (c19eg3 == null) {
                        c19eg3 = null;
                    }
                    string2 = c19eg3.getResources().getString(2131829781, Integer.valueOf(i9));
                }
                tuxTextView5.setText(string2);
            }
        } else {
            int i10 = i7 / LSPassThroughRecordSizeConfig.DEFAULT;
            int i11 = i10 / 60;
            int i12 = i10 % 60;
            TuxTextView tuxTextView6 = this.LLLJIL;
            if (tuxTextView6 != null) {
                if (i11 > 0) {
                    C19EG c19eg4 = this.LLILLJJLI;
                    if (c19eg4 == null) {
                        c19eg4 = null;
                    }
                    string = c19eg4.getResources().getString(2131829780, String.valueOf(i11), String.valueOf(i12));
                } else {
                    C19EG c19eg5 = this.LLILLJJLI;
                    if (c19eg5 == null) {
                        c19eg5 = null;
                    }
                    string = c19eg5.getResources().getString(2131829781, Integer.valueOf(i12));
                }
                tuxTextView6.setText(string);
            }
        }
        if (C1399580mWa.LIZ() && i2 > i) {
            i2 = 0;
        }
        SR(i2);
        this.LLLLIILLL = i4;
        if (C1458070o2v.LJFF() && i4 > 0 && i < this.LLLLJI) {
            iAw = (Aw() * i) / Math.min(i4, this.LLLLJI);
        } else {
            iAw = (Aw() * i) / i3;
        }
        this.LL = iAw;
        if (iAw != musicWaveBean.getMusicWavePointArray().length) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LLLLL);
            sbLIZ3.append("error wave size: aimcnt:");
            sbLIZ3.append(this.LL);
            sbLIZ3.append(" , arr: ");
            sbLIZ3.append(musicWaveBean.getMusicWavePointArray().length);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (C15KF.LJI(musicWaveBean.getMusicWavePointArray())) {
            C15LR c15lr3 = this.LLILZIL;
            if (c15lr3 == null) {
                c15lr3 = null;
            }
            c15lr3.getCutMusicView().setAudioWaveViewData(musicWaveBean);
            C0H4I c0h4i = c15lr3.LLILLJJLI;
            if (c0h4i == null) {
                c0h4i = null;
            }
            c15lr3.setAdapter(c0h4i);
            if (C1458070o2v.LJFF()) {
                MusicWaveBean musicWaveBeanOR = OR(i, i4, musicWaveBean);
                if (musicWaveBeanOR != null && (musicWavePointArray2 = musicWaveBeanOR.getMusicWavePointArray()) != null && musicWavePointArray2.length > 0) {
                    C15LR c15lr4 = this.LLILZIL;
                    if (c15lr4 != null) {
                        c15lr2 = c15lr4;
                    }
                    if (musicWaveBeanOR != null) {
                        c15lr2.getCutMusicView().setAudioLoopWaveViewData(musicWaveBeanOR);
                    } else {
                        c15lr2.getClass();
                    }
                } else {
                    C15LR c15lr5 = this.LLILZIL;
                    if (c15lr5 != null) {
                        c15lr2 = c15lr5;
                    }
                    c15lr2.getCutMusicView().setAudioLoopWaveViewData(new MusicWaveBean());
                }
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.LLLLL);
            sbLIZ4.append("use default view");
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            MusicWaveBean musicWaveBeanLJ = C15KF.LJ(this.LL);
            C15LR c15lr6 = this.LLILZIL;
            if (c15lr6 == null) {
                c15lr6 = null;
            }
            c15lr6.getCutMusicView().setAudioWaveViewData(musicWaveBeanLJ);
            C0H4I c0h4i2 = c15lr6.LLILLJJLI;
            if (c0h4i2 == null) {
                c0h4i2 = null;
            }
            c15lr6.setAdapter(c0h4i2);
            if (C1458070o2v.LJFF()) {
                MusicWaveBean musicWaveBeanOR2 = OR(i, i4, musicWaveBeanLJ);
                if (musicWaveBeanOR2 != null && (musicWavePointArray = musicWaveBeanOR2.getMusicWavePointArray()) != null && musicWavePointArray.length > 0) {
                    C15LR c15lr7 = this.LLILZIL;
                    if (c15lr7 != null) {
                        c15lr2 = c15lr7;
                    }
                    if (musicWaveBeanOR2 != null) {
                        c15lr2.getCutMusicView().setAudioLoopWaveViewData(musicWaveBeanOR2);
                    } else {
                        c15lr2.getClass();
                    }
                } else {
                    C15LR c15lr8 = this.LLILZIL;
                    if (c15lr8 != null) {
                        c15lr2 = c15lr8;
                    }
                    c15lr2.getCutMusicView().setAudioLoopWaveViewData(new MusicWaveBean());
                }
            }
        }
        fC((i2 * 1.0f) / i, i2);
        return true;
    }
}
