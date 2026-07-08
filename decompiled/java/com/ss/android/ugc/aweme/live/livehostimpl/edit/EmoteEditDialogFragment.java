package com.ss.android.ugc.aweme.live.livehostimpl.edit;

import X.AnonymousClass1258;
import X.AnonymousClass1671;
import X.AnonymousClass1673;
import X.AnonymousClass1676;
import X.AnonymousClass1677;
import X.C0IJT;
import X.C0IPN;
import X.C0S2Y;
import X.C1002310cBp;
import X.C1143250fr9;
import X.C1143680frq;
import X.C125C;
import X.C125J;
import X.C125R;
import X.C125W;
import X.C125X;
import X.C1324720kZq;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1451800nso;
import X.C1602160rnK;
import X.C1659660tI4;
import X.C167E;
import X.C167I;
import X.C167L;
import X.C167P;
import X.C16F5;
import X.C16FS;
import X.C16HB;
import X.C1766560w4U;
import X.C1831820xlk;
import X.C1840250xzL;
import X.C1840270xzN;
import X.C196986125g;
import X.C19740512Lj;
import X.C19EG;
import X.C19R6;
import X.C207221166x;
import X.C20747816Gu;
import X.C21513519Hh;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C817403Hg;
import X.C842150X1x;
import X.C844470XAv;
import X.DialogC780480UjW;
import X.EnumC207219166v;
import X.InterfaceC196980125a;
import X.InterfaceC196983125d;
import X.InterfaceC196984125e;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS165S0100000_31;
import Y.ACListenerS7S0200001_31;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS131S0100000_31;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public final class EmoteEditDialogFragment extends LiveDialogFragment implements C167L {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8HELIOSOzElJD8/ZiAoIDt9DSgjPSoWLCw4DSYyJCorDz0yLygpJzs=";
    public C125C LL;
    public C1002310cBp LLILLJJLI;
    public C16F5 LLILLL;
    public RelativeLayout LLILZ;
    public C0S2Y LLILZIL;
    public C1840250xzL LLILZLL;
    public C21513519Hh LLIZ;
    public LiveIconView LLIZLLLIL;
    public C16FS LLJ;
    public LiveIconView LLJI;
    public RelativeLayout LLJIJIL;
    public C1324720kZq LLJILJIL;
    public C1840270xzN LLJILJILJ;
    public C19R6 LLJILLL;
    public RelativeLayout LLJJ;
    public FrameLayout LLJJI;
    public AnonymousClass1677 LLJJIII;
    public Bitmap LLJJIJI;
    public Bitmap LLJJIJIIJIL;
    public Bitmap LLJJIJIL;
    public Bitmap LLJJJ;
    public Rect LLJJJJJIL;
    public C167I LLJJJJLIIL;
    public SafeHandler LLJJL;
    public C125W LLJJLIIIJLLLLLLLZ;
    public C125R LLJL;
    public EditTextStickerViewModel LLJLIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public float LLL;
    public long LLLF;
    public DialogC780480UjW LLLFF;
    public boolean LLLFFI;
    public TextStickerData LLLFZ;
    public C125R LLLI;
    public boolean LLLII;
    public final int LLJJJIL = 64;
    public AnonymousClass1673 LLJJJJ = AnonymousClass1673.OTHER;
    public Rect LLJLILLLLZIIL = new Rect(0, 0, 0, 0);
    public final C167E LLLIIII = new InterfaceC196980125a() { // from class: X.167E
        @Override // X.InterfaceC196980125a
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC196980125a
        public final void LIZLLL() {
        }

        @Override // X.InterfaceC196980125a
        public final void LIZ() {
            C19R6 c19r6UR = this.LIZ.UR();
            if (c19r6UR != null) {
                HandlerHook.viewPost(c19r6UR, new ARunnableS131S0100000_31(this.LIZ, 69));
            }
        }

        @Override // X.InterfaceC196980125a
        public final void LIZJ() {
            Map<String, Object> map;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_emote_edit_page_edit_text");
            AnonymousClass1677 anonymousClass1677 = this.LIZ.LLJJIII;
            if (anonymousClass1677 != null && (map = anonymousClass1677.LJ) != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    c474500IjALIZ.LJJII(entry.getValue().toString(), entry.getKey());
                }
            }
            c474500IjALIZ.LIZ();
        }
    };

    @Override // X.C167L
    public final void LLLL(int i) {
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C1002310cBp PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gpu) : null;
            this.LLILLJJLI = (C1002310cBp) viewFindViewById;
        }
        return (C1002310cBp) viewFindViewById;
    }

    public final FrameLayout RR() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iap) : null;
            this.LLJJI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C21513519Hh SR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ld7) : null;
            this.LLIZ = (C21513519Hh) viewFindViewById;
        }
        return (C21513519Hh) viewFindViewById;
    }

    public final C19R6 UR() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.lrt) : null;
            this.LLJILLL = (C19R6) viewFindViewById;
        }
        return (C19R6) viewFindViewById;
    }

    public final C1840250xzL VR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rp8) : null;
            this.LLILZLL = (C1840250xzL) viewFindViewById;
        }
        return (C1840250xzL) viewFindViewById;
    }

    public final C0S2Y WR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w45) : null;
            this.LLILZIL = (C0S2Y) viewFindViewById;
        }
        return (C0S2Y) viewFindViewById;
    }

    public final C125C aS() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xqp) : null;
            this.LL = (C125C) viewFindViewById;
        }
        return (C125C) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.djp);
        c500980Jkm.LIZJ = R.style.ahl;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        Map<String, Object> map;
        TextStickerData textStickerData;
        C125R c125r;
        AnonymousClass1676 anonymousClass1676;
        AnonymousClass1676 anonymousClass16762;
        AnonymousClass1676 anonymousClass16763;
        super.onDestroy();
        C167I c167i = this.LLJJJJLIIL;
        if (c167i != null) {
            View view = c167i.LIZ;
            if (view != null && c167i.LJ != null) {
                C786410Ut5.C3(view.getViewTreeObserver(), c167i.LJ);
            }
            c167i.LIZJ = null;
        }
        C125R c125r2 = this.LLJL;
        if ((c125r2 != null ? c125r2.getParent() : null) instanceof ViewGroup) {
            C125R c125r3 = this.LLJL;
            C786410Ut5.LJJJLZIJ(this.LLJL, (ViewGroup) (c125r3 != null ? c125r3.getParent() : null));
        }
        int i = AnonymousClass1671.LIZIZ[this.LLJJJJ.ordinal()];
        if (i == 1) {
            str = "done";
        } else if (i == 2) {
            AnonymousClass1677 anonymousClass1677 = this.LLJJIII;
            if (anonymousClass1677 != null && (anonymousClass1676 = anonymousClass1677.LJIIJ) != null) {
                anonymousClass1676.LIZIZ();
            }
            str = "delete";
        } else if (i != 3) {
            AnonymousClass1677 anonymousClass16772 = this.LLJJIII;
            if (anonymousClass16772 != null && (anonymousClass16763 = anonymousClass16772.LJIIJ) != null) {
                anonymousClass16763.LIZ();
            }
            str = "others";
        } else {
            AnonymousClass1677 anonymousClass16773 = this.LLJJIII;
            if (anonymousClass16773 != null && (anonymousClass16762 = anonymousClass16773.LJIIJ) != null) {
                anonymousClass16762.LIZ();
            }
            str = "back";
        }
        if (this.LLJJJJ != AnonymousClass1673.DONE && (textStickerData = this.LLLFZ) != null && (c125r = this.LLLI) != null) {
            c125r.LJFF(textStickerData);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_emote_edit_page_leave");
        c474500IjALIZ.LJJII(Long.valueOf(SystemClock.elapsedRealtime() - this.LLLF), "duration");
        c474500IjALIZ.LJJII(str, "leave_type");
        AnonymousClass1677 anonymousClass16774 = this.LLJJIII;
        if (anonymousClass16774 != null && (map = anonymousClass16774.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                c474500IjALIZ.LJJII(entry.getValue().toString(), entry.getKey());
            }
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // X.C167L
    public final void LJJIIJ(int i) {
        this.LLLII = true;
        C125C c125cAS = aS();
        if (c125cAS != null) {
            c125cAS.LIZJ();
        }
        C125C c125cAS2 = aS();
        if (c125cAS2 != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c125cAS2.LLJILJIL.getLayoutParams();
            layoutParams.bottomMargin = i;
            C786410Ut5.W5(c125cAS2.LLJILJIL, layoutParams);
        }
        C125R c125r = this.LLJL;
        if (c125r != null) {
            c125r.LIZJ();
        }
    }

    @Override // X.C167L
    public final void LJZI(int i) {
        boolean z = false;
        this.LLLII = false;
        C125C c125cAS = aS();
        if (c125cAS != null) {
            c125cAS.LIZ();
        }
        C125R c125r = this.LLJL;
        if (c125r != null) {
            c125r.LIZLLL();
        }
        List<TextStickerTextWrap> textWrapList = aS().getTextWrapList();
        SafeHandler safeHandler = null;
        if (AnonymousClass1258.LJ(textWrapList)) {
            C125R c125r2 = this.LLJL;
            if (c125r2 != null) {
                c125r2.getData();
                c125r2.LJIIJJI(aS().getCurTxtMode(), aS().getCurColor(), aS().getAlignTxt(), C196986125g.LJFF().LIZJ);
                c125r2.setFontSize(this.LLJJJIL);
                c125r2.setText(textWrapList);
                return;
            }
            TextStickerData textStickerData = new TextStickerData("", aS().getCurTxtMode(), aS().getCurColor(), aS().getAlignTxt(), C196986125g.LJFF().LIZJ, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -32, 511, null);
            textStickerData.setEditCenterPoint(aS().getEditInputScreenCenterPoint());
            textStickerData.setTextWrapList(textWrapList);
            textStickerData.setFontSize(this.LLJJJIL);
            if (textStickerData.isCaption()) {
                z = true;
            }
            boolean z2 = !z;
            C19EG activity = getActivity();
            SafeHandler safeHandler2 = this.LLJJL;
            if (safeHandler2 != null) {
                safeHandler = safeHandler2;
            }
            MR(new C125R(activity, safeHandler, textStickerData, z2, new InterfaceC196984125e() { // from class: X.167M
                @Override // X.InterfaceC196984125e
                public final boolean LIZ() {
                    EditTextStickerViewModel editTextStickerViewModel = this.LIZ.LLJLIL;
                    if (editTextStickerViewModel == null) {
                        editTextStickerViewModel = null;
                    }
                    return editTextStickerViewModel.LLLLZLLIL();
                }
            }));
            return;
        }
        C125R c125r3 = this.LLJL;
        if (c125r3 != null) {
            EditTextStickerViewModel editTextStickerViewModel = this.LLJLIL;
            if (editTextStickerViewModel == null) {
                editTextStickerViewModel = null;
            }
            editTextStickerViewModel.wR2(c125r3);
        }
        this.LLJL = null;
    }

    public final void MR(final C125R c125r) {
        EditTextStickerViewModel editTextStickerViewModel = this.LLJLIL;
        EditTextStickerViewModel editTextStickerViewModel2 = null;
        if (editTextStickerViewModel == null) {
            editTextStickerViewModel = null;
        }
        editTextStickerViewModel.jR2(c125r);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c125r);
        c125r.setLayoutParams(layoutParams);
        C1002310cBp c1002310cBpPR = PR();
        int visibility = c1002310cBpPR.getVisibility();
        c1002310cBpPR.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1002310cBpPR);
        RR().addView(c125r);
        this.LLJL = c125r;
        c125r.setOnEditClickListener(new C125X() { // from class: X.1679
            @Override // X.C125X
            public final float LIZ(float f) {
                return f;
            }

            @Override // X.C125X
            public final void LIZIZ() {
            }

            @Override // X.C125X
            public final void LIZJ() {
            }

            @Override // X.C125X
            public final void LJLJI() {
            }

            @Override // X.C125X
            public final PointF LJI() {
                return new PointF(0.0f, 0.0f);
            }

            @Override // X.C125X
            public final void LIZLLL(C125R c125r2) {
                EditTextStickerViewModel editTextStickerViewModel3 = this.LIZ.LLJLIL;
                if (editTextStickerViewModel3 == null) {
                    editTextStickerViewModel3 = null;
                }
                editTextStickerViewModel3.c2().LJIIJ(Boolean.FALSE);
                EmoteEditDialogFragment emoteEditDialogFragment = this.LIZ;
                emoteEditDialogFragment.LLJL = c125r2;
                emoteEditDialogFragment.dS(c125r2);
            }

            @Override // X.C125X
            public final void LJ(C125R c125r2) {
                EmoteEditDialogFragment emoteEditDialogFragment = this.LIZ;
                emoteEditDialogFragment.LLJJIJIL = emoteEditDialogFragment.ZR(c125r2);
                this.LIZ.bS(c125r2);
            }

            @Override // X.C125X
            public final void LJFF(C125R c125r2, C167O c167o) {
                if (!c167o.LIZLLL) {
                    boolean zLIZ = C0GTT.LIZ(this.LIZ.LLJLILLLLZIIL, c125r2.getAnglePointList());
                    C0S2Y c0s2yWR = this.LIZ.WR();
                    if (c0s2yWR != null) {
                        EmoteEditDialogFragment emoteEditDialogFragment = this.LIZ;
                        int iLIZJ = c0s2yWR.LIZJ(c167o.LIZ - c125r2.getDeltaX(), c167o.LIZIZ - c125r2.getDeltaY(), c167o.LIZJ, zLIZ);
                        emoteEditDialogFragment.getClass();
                        if (iLIZJ != 1) {
                            if (iLIZJ != 3) {
                                if (iLIZJ == 4) {
                                    c125r2.LJIIJ(0.3137255f, true);
                                }
                            } else {
                                C786410Ut5.LJJJZ(c125r2, emoteEditDialogFragment.RR());
                                EditTextStickerViewModel editTextStickerViewModel3 = emoteEditDialogFragment.LLJLIL;
                                if (editTextStickerViewModel3 == null) {
                                    editTextStickerViewModel3 = null;
                                }
                                editTextStickerViewModel3.wR2(c125r2);
                                emoteEditDialogFragment.LLJL = null;
                                C1002310cBp c1002310cBpPR2 = emoteEditDialogFragment.PR();
                                int visibility2 = c1002310cBpPR2.getVisibility();
                                c1002310cBpPR2.setVisibility(8);
                                C1602160rnK.LIZIZ(visibility2, 8, c1002310cBpPR2);
                                ViewGroup.LayoutParams layoutParams2 = emoteEditDialogFragment.PR().getLayoutParams();
                                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                    marginLayoutParams.leftMargin = 0;
                                    marginLayoutParams.topMargin = 0;
                                }
                                layoutParams2.width = -1;
                                layoutParams2.height = -1;
                                C1002310cBp c1002310cBpPR3 = emoteEditDialogFragment.PR();
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1002310cBpPR3);
                                c1002310cBpPR3.setLayoutParams(layoutParams2);
                                FrameLayout frameLayoutRR = emoteEditDialogFragment.RR();
                                if (frameLayoutRR != null) {
                                    HandlerHook.viewPost(frameLayoutRR, new ARunnableS131S0100000_31(emoteEditDialogFragment, 190));
                                }
                            }
                        } else {
                            c125r2.LJIIJ(0.3137255f, false);
                        }
                    }
                }
                if (this.LIZ.WR() != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c125r2);
                    c125r2.setAlpha(1.0f);
                }
            }
        });
        c125r.setMotionInterceptor(new InterfaceC196983125d() { // from class: X.167H
            @Override // X.InterfaceC196983125d
            public final boolean LIZ() {
                EmoteEditDialogFragment emoteEditDialogFragment = this.LIZ;
                C125R c125r2 = c125r;
                EditTextStickerViewModel editTextStickerViewModel3 = emoteEditDialogFragment.LLJLIL;
                if (editTextStickerViewModel3 == null) {
                    editTextStickerViewModel3 = null;
                }
                editTextStickerViewModel3.c2().LJIIJ(Boolean.FALSE);
                emoteEditDialogFragment.LLJL = c125r2;
                emoteEditDialogFragment.dS(c125r2);
                return true;
            }
        });
        c125r.LJIILIIL(0, 0);
        c125r.setInitOffsetY(-this.LLL);
        EditTextStickerViewModel editTextStickerViewModel3 = this.LLJLIL;
        if (editTextStickerViewModel3 != null) {
            editTextStickerViewModel2 = editTextStickerViewModel3;
        }
        editTextStickerViewModel2.Fo();
        C125R c125r2 = this.LLJL;
        if (c125r2 != null) {
            c125r2.setEditModeListener(this.LLLIIII);
        }
        FrameLayout frameLayoutRR = RR();
        if (frameLayoutRR != null) {
            HandlerHook.viewPost(frameLayoutRR, new ARunnableS100S0200000_31(this, c125r, 19));
        }
    }

    public final Bitmap ZR(C125R c125r) {
        if (c125r == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c125r.getMeasuredWidth(), c125r.getHeight(), Bitmap.Config.ARGB_8888);
            C844470XAv.LIZ.getClass();
            bitmapCreateBitmap.setDensity(C844470XAv.LIZ().getResources().getDisplayMetrics().densityDpi);
            if (c125r.getDrawingCacheBackgroundColor() != 0) {
                bitmapCreateBitmap.eraseColor(c125r.getDrawingCacheBackgroundColor());
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(-c125r.getScrollX(), -c125r.getScrollY());
            C842150X1x.LIZIZ(canvas, c125r);
            int i = this.LLJLL;
            int i2 = this.LLJLLIL;
            int i3 = this.LLJLLL;
            return Bitmap.createBitmap(bitmapCreateBitmap, i, i2, i3, i3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void bS(C125R c125r) {
        if (this.LLJL != null) {
            RectF helpRect = c125r.getHelpRect();
            float f = helpRect.right - helpRect.left;
            float f2 = helpRect.bottom - helpRect.top;
            ViewGroup.LayoutParams layoutParams = PR().getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = (int) helpRect.left;
                marginLayoutParams.topMargin = (int) helpRect.top;
            }
            layoutParams.width = (int) f;
            layoutParams.height = (int) f2;
            C1002310cBp c1002310cBpPR = PR();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1002310cBpPR);
            c1002310cBpPR.setLayoutParams(layoutParams);
            C125R c125r2 = this.LLJL;
            if (c125r2 != null) {
                c125r2.LJIILIIL(-((int) helpRect.left), -((int) helpRect.top));
            }
        }
    }

    public final void cS(final Bitmap bitmap) {
        this.LLJJIJI = bitmap;
        this.LLJJIJIIJIL = bitmap;
        View viewFindViewById = this.LLJILJILJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.wug);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJILJ = (C1840270xzN) viewFindViewById;
        }
        C1840270xzN c1840270xzN = (C1840270xzN) viewFindViewById;
        if (c1840270xzN != null) {
            c1840270xzN.setIntercepter(new C1831820xlk() { // from class: X.167A
                @Override // X.InterfaceC1840280xzO
                public final void LJJJJ(MotionEvent motionEvent) {
                    Map<String, Object> map;
                    Rect visibleRect;
                    this.LIZ.LLLFFI = true;
                    if (motionEvent != null) {
                        if (motionEvent.getAction() == 0) {
                            C1840250xzL c1840250xzLVR = this.LIZ.VR();
                            if (c1840250xzLVR != null) {
                                c1840250xzLVR.LIZIZ();
                                return;
                            }
                            return;
                        }
                        if (motionEvent.getAction() != 1) {
                            return;
                        }
                        EmoteEditDialogFragment emoteEditDialogFragment = this.LIZ;
                        if (emoteEditDialogFragment.LLJJJJJIL == null) {
                            C1840250xzL c1840250xzLVR2 = emoteEditDialogFragment.VR();
                            if (c1840250xzLVR2 != null) {
                                visibleRect = c1840250xzLVR2.getVisibleRect();
                            } else {
                                visibleRect = null;
                            }
                            emoteEditDialogFragment.LLJJJJJIL = visibleRect;
                        }
                        C1840250xzL c1840250xzLVR3 = this.LIZ.VR();
                        if (c1840250xzLVR3 != null) {
                            c1840250xzLVR3.LIZJ();
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_emote_edit_page_cut_up");
                        AnonymousClass1677 anonymousClass1677 = this.LIZ.LLJJIII;
                        if (anonymousClass1677 != null && (map = anonymousClass1677.LJ) != null) {
                            for (Map.Entry<String, Object> entry : map.entrySet()) {
                                c474500IjALIZ.LJJII(entry.getValue().toString(), entry.getKey());
                            }
                        }
                        c474500IjALIZ.LIZ();
                        C21513519Hh c21513519HhSR = this.LIZ.SR();
                        if (c21513519HhSR == null) {
                            return;
                        }
                        HandlerHook.viewPostDelay(c21513519HhSR, new ARunnableS131S0100000_31(this.LIZ, 65), 310L);
                    }
                }
            });
        }
        C21513519Hh c21513519HhSR = SR();
        if (c21513519HhSR != null) {
            c21513519HhSR.setImageBitmap(this.LLJJIJI);
        }
        final float f = (this.LLJZIJLIL / 2.0f) - (this.LLJLLIL + (this.LLJLLL / 2));
        final C817403Hg c817403Hg = new C817403Hg();
        if (bitmap != null && this.LLJLLL > 0) {
            int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
            int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
            if (iMin > 0) {
                c817403Hg.element = (((iMax * this.LLJLLL) / iMin) - this.LLJZ) / 2.0f;
            }
        }
        View view2 = this.LLJJ;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.tpa);
            }
            this.LLJJ = (RelativeLayout) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        RelativeLayout relativeLayout = (RelativeLayout) view2;
        if (relativeLayout != null) {
            C786410Ut5.S7(relativeLayout, new ACListenerS7S0200001_31(this, f, c817403Hg, 0));
        }
        C19R6 c19r6UR = UR();
        if (c19r6UR != null) {
            c19r6UR.setImageBitmap(this.LLJJIJIIJIL);
        }
        C21513519Hh c21513519HhSR2 = SR();
        if (c21513519HhSR2 != null) {
            c21513519HhSR2.setFirstReadyListener(new C167P() { // from class: X.167C
                /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
                @Override // X.C167P
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 216
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C167C.LIZ():void");
                }
            });
        }
    }

    public final void dS(C125R c125r) {
        int fontSize;
        aS().setTextStickerView(c125r);
        EditTextStickerViewModel editTextStickerViewModel = this.LLJLIL;
        EditTextStickerViewModel editTextStickerViewModel2 = null;
        if (editTextStickerViewModel == null) {
            editTextStickerViewModel = null;
        }
        editTextStickerViewModel.LLIZLLLIL = null;
        if (c125r == null) {
            C125C c125cAS = aS();
            EditTextStickerViewModel editTextStickerViewModel3 = this.LLJLIL;
            if (editTextStickerViewModel3 == null) {
                editTextStickerViewModel3 = null;
            }
            c125cAS.LIZLLL(editTextStickerViewModel3.T10());
            this.LLJL = null;
            return;
        }
        C125C c125cAS2 = aS();
        List<TextStickerTextWrap> textWrapList = c125r.getTextWrapList();
        int curMode = c125r.getCurMode();
        int curColor = c125r.getCurColor();
        int curAlignTxt = c125r.getCurAlignTxt();
        String curFontType = c125r.getCurFontType();
        TextStickerData data = c125r.getData();
        if (data != null) {
            fontSize = data.getFontSize();
        } else {
            fontSize = this.LLJJJIL;
        }
        EditTextStickerViewModel editTextStickerViewModel4 = this.LLJLIL;
        if (editTextStickerViewModel4 != null) {
            editTextStickerViewModel2 = editTextStickerViewModel4;
        }
        editTextStickerViewModel2.T10();
        c125cAS2.LJ(textWrapList, curMode, curColor, curAlignTxt, curFontType, false, fontSize);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final Bitmap NR(C21513519Hh c21513519Hh, Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        RectF rectFLIZLLL = c21513519Hh.LIZLLL(null);
        if (this.LLJJJJJIL == null) {
            return bitmap;
        }
        float width = bitmap.getWidth() / rectFLIZLLL.width();
        float height = bitmap.getHeight() / rectFLIZLLL.height();
        int i = (int) ((r6.left - rectFLIZLLL.left) * width);
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        int i3 = (int) ((r6.top - rectFLIZLLL.top) * height);
        if (i3 >= 0) {
            i2 = i3;
        }
        int iWidth = (int) (r6.width() * width);
        int width2 = bitmap.getWidth() - i;
        if (iWidth > width2) {
            iWidth = width2;
        }
        int iHeight = (int) (r6.height() * height);
        int height2 = bitmap.getHeight() - i2;
        if (iHeight > height2) {
            iHeight = height2;
        }
        try {
            return Bitmap.createBitmap(bitmap, i, i2, iWidth, iHeight);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return bitmap;
        }
    }

    public final Bitmap OR(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmap3 = this.LLJJIJIIJIL;
        if (bitmap != null) {
            Bitmap bitmap4 = this.LLJJJ;
            Bitmap.Config config = bitmap.getConfig();
            if (bitmap2 != null && config != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, bitmap.getWidth(), bitmap.getHeight(), true);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawBitmap(bitmap, new Matrix(), null);
                canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
                return bitmapCreateBitmap;
            }
            return bitmap4;
        }
        return bitmap3;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC207219166v enumC207219166v;
        Uri uri;
        String str;
        C207221166x c207221166x;
        boolean z;
        Window window;
        Map<String, Object> map;
        super.onViewCreated(view, bundle);
        this.LLLF = SystemClock.elapsedRealtime();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_emote_edit_page_show");
        AnonymousClass1677 anonymousClass1677 = this.LLJJIII;
        if (anonymousClass1677 != null && (map = anonymousClass1677.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                c474500IjALIZ.LJJII(entry.getValue().toString(), entry.getKey());
            }
        }
        c474500IjALIZ.LIZ();
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LIZLLL();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.getDecorView().setFitsSystemWindows(false);
            window.setSoftInputMode(48);
            window.getDecorView().setSystemUiVisibility(1024);
        }
        C167I c167i = new C167I(getActivity());
        c167i.LIZJ = this;
        View view2 = c167i.LIZ;
        if (view2 != null && c167i.LJ != null) {
            C786410Ut5.x3(view2.getViewTreeObserver(), c167i.LJ);
        }
        this.LLJJJJLIIL = c167i;
        C19EG activity = getActivity();
        Bitmap bitmap = null;
        if (activity != null) {
            this.LLJLIL = (EditTextStickerViewModel) new C1659660tI4(getViewModelStore(), new C1143250fr9()).LIZ(EditTextStickerViewModel.class);
            this.LLJLILLLLZIIL = new Rect(0, 0, ScreenUtils.getScreenWidth(activity), ScreenUtils.getScreenHeight(activity));
            this.LLJJL = new SafeHandler(activity);
            EditTextStickerViewModel editTextStickerViewModel = this.LLJLIL;
            if (editTextStickerViewModel == null) {
                editTextStickerViewModel = null;
            }
            this.LLJJLIIIJLLLLLLLZ = new C125W(editTextStickerViewModel);
            C19740512Lj c19740512LjLIZ = C1451800nso.LIZ(activity, PR(), 0, 12);
            C125W c125w = this.LLJJLIIIJLLLLLLLZ;
            if (c125w == null) {
                c125w = null;
            }
            c19740512LjLIZ.LIZIZ(new GestureInteractItem(200, c125w));
        }
        if (getContext() != null) {
            this.LLJLL = (int) C497740JfY.LIZIZ(12.0f);
            this.LLJLLIL = (int) C497740JfY.LIZIZ(93.0f);
            this.LLJLLL = ScreenUtils.getScreenWidth(getContext()) - (this.LLJLL * 2);
            this.LLJZ = ScreenUtils.getScreenWidth(getContext());
            int screenHeight = ScreenUtils.getScreenHeight(getContext());
            this.LLJZIJLIL = screenHeight;
            this.LLL = (screenHeight / 2.0f) - ((this.LLJLLL / 2.0f) + this.LLJLLIL);
            View viewFindViewById = this.LLILLL;
            if (viewFindViewById == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.tv_preview_des);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLL = (C16F5) viewFindViewById;
            }
            ((RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()).topMargin = this.LLJLLIL + this.LLJLLL + ((int) C497740JfY.LIZIZ(24.0f));
            AnonymousClass1677 anonymousClass16772 = this.LLJJIII;
            if (anonymousClass16772 != null && anonymousClass16772.LIZLLL == 2) {
                View viewFindViewById2 = this.LLILLL;
                if (viewFindViewById2 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById2 = view4.findViewById(R.id.tv_preview_des);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLILLL = (C16F5) viewFindViewById2;
                }
                C786410Ut5.LLJJJJ((C16F5) viewFindViewById2, 8);
                View viewFindViewById3 = this.LLILZ;
                if (viewFindViewById3 == null) {
                    View view5 = getView();
                    if (view5 != null) {
                        viewFindViewById3 = view5.findViewById(R.id.tou);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLILZ = (RelativeLayout) viewFindViewById3;
                }
                C786410Ut5.LLIIL((RelativeLayout) viewFindViewById3, 8);
            }
            WR().LJ();
            C1840250xzL c1840250xzLVR = VR();
            c1840250xzLVR.LLILZIL = 0;
            c1840250xzLVR.LLILZLL = 1.0f;
            c1840250xzLVR.LLJILLL = this.LLJLLIL;
            c1840250xzLVR.LLILZ = this.LLJLL;
            c1840250xzLVR.LLJILJILJ = C497740JfY.LIZIZ(8.0f);
            HandlerHook.viewPostDelay(c1840250xzLVR, new ARunnableS131S0100000_31(this, 184), Mp4ScreenVideoLoadTimeout.CONTROL);
            c1840250xzLVR.addOnLayoutChangeListener(new C16HB(this, 10));
            SR().setEnableDoubleTap(false);
            View viewFindViewById4 = this.LLIZLLLIL;
            if (viewFindViewById4 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById4 = view6.findViewById(R.id.cnb);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLIZLLLIL = (LiveIconView) viewFindViewById4;
            }
            C786410Ut5.g8((LiveIconView) viewFindViewById4, new ACListenerS165S0100000_31(this, 214));
            View viewFindViewById5 = this.LLJ;
            if (viewFindViewById5 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById5 = view7.findViewById(R.id.cpn);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJ = (C16FS) viewFindViewById5;
            }
            C786410Ut5.h8((C16FS) viewFindViewById5, new ACListenerS165S0100000_31(this, 215));
            AnonymousClass1677 anonymousClass16773 = this.LLJJIII;
            if (anonymousClass16773 != null && anonymousClass16773.LJFF) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View viewFindViewById6 = this.LLJI;
                if (viewFindViewById6 == null) {
                    View view8 = getView();
                    if (view8 != null) {
                        viewFindViewById6 = view8.findViewById(R.id.cpg);
                    } else {
                        viewFindViewById6 = null;
                    }
                    this.LLJI = (LiveIconView) viewFindViewById6;
                }
                C786410Ut5.LLJJIJIL((LiveIconView) viewFindViewById6, 0);
            }
            View viewFindViewById7 = this.LLJI;
            if (viewFindViewById7 == null) {
                View view9 = getView();
                if (view9 != null) {
                    viewFindViewById7 = view9.findViewById(R.id.cpg);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLJI = (LiveIconView) viewFindViewById7;
            }
            C786410Ut5.g8((LiveIconView) viewFindViewById7, new ACListenerS165S0100000_31(this, 216));
            aS().setTextStickerUpdateListener(new C125J() { // from class: X.167J
                @Override // X.C125J
                public final void LIZ() {
                    this.LIZ.aS().LIZIZ();
                }
            });
            View viewFindViewById8 = this.LLJIJIL;
            if (viewFindViewById8 == null) {
                View view10 = getView();
                if (view10 != null) {
                    viewFindViewById8 = view10.findViewById(R.id.tpn);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLJIJIL = (RelativeLayout) viewFindViewById8;
            }
            C786410Ut5.S7((RelativeLayout) viewFindViewById8, new ACListenerS165S0100000_31(this, 218));
            View viewFindViewById9 = this.LLJILJIL;
            if (viewFindViewById9 == null) {
                View view11 = getView();
                if (view11 != null) {
                    viewFindViewById9 = view11.findViewById(R.id.l9h);
                } else {
                    viewFindViewById9 = null;
                }
                this.LLJILJIL = (C1324720kZq) viewFindViewById9;
            }
            C1143680frq.LIZLLL(viewFindViewById9, C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_outside_demand_1"), "ttlive_subcribe_emote_preview_avatar.png");
        }
        AnonymousClass1677 anonymousClass16774 = this.LLJJIII;
        if (anonymousClass16774 != null && (enumC207219166v = anonymousClass16774.LIZJ) != null) {
            int i = AnonymousClass1671.LIZ[enumC207219166v.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            AnonymousClass1677 anonymousClass16775 = this.LLJJIII;
                            if (anonymousClass16775 != null && (c207221166x = anonymousClass16775.LJIIIZ) != null) {
                                cS(c207221166x.LIZJ);
                                Object obj = c207221166x.LIZLLL;
                                if (obj instanceof C125R) {
                                    C125R c125r = (C125R) obj;
                                    this.LLLI = c125r;
                                    this.LLLFZ = c125r.LIZIZ().m252clone();
                                    MR(c125r);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        AnonymousClass1677 anonymousClass16776 = this.LLJJIII;
                        if (anonymousClass16776 == null || (str = anonymousClass16776.LJIIIIZZ) == null) {
                            return;
                        }
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                        c1331670kl3LJIIIZ.LJJIJLIJ(this);
                        c1331670kl3LJIIIZ.LJJII(new C20747816Gu(this, 2));
                        return;
                    }
                } else {
                    AnonymousClass1677 anonymousClass16777 = this.LLJJIII;
                    if (anonymousClass16777 == null || (uri = anonymousClass16777.LJII) == null) {
                        return;
                    }
                    C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uri);
                    c1331670kl3LJI.LJJIJLIJ(this);
                    c1331670kl3LJI.LJJII(new C20747816Gu(this, 1));
                    return;
                }
            } else {
                AnonymousClass1677 anonymousClass16778 = this.LLJJIII;
                if (anonymousClass16778 != null) {
                    bitmap = anonymousClass16778.LJI;
                }
                cS(bitmap);
                return;
            }
        }
        AnonymousClass1677 anonymousClass16779 = this.LLJJIII;
        if (anonymousClass16779 != null) {
            bitmap = anonymousClass16779.LJI;
        }
        cS(bitmap);
    }
}
