package com.ss.android.ugc.aweme.live.livehostimpl.edit;

import X.AnonymousClass1670;
import X.AnonymousClass1673;
import X.C0IJT;
import X.C0JDJ;
import X.C0S2Y;
import X.C1002310cBp;
import X.C125C;
import X.C167P;
import X.C16FS;
import X.C1831820xlk;
import X.C1840250xzL;
import X.C1840270xzN;
import X.C19EG;
import X.C207213166p;
import X.C21513519Hh;
import X.C465220IMe;
import X.C474500IjA;
import X.C495190JbR;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C817403Hg;
import X.DialogC780480UjW;
import Y.ACListenerS133S0200000_31;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public final class SpotlightImageListPreviewDialogFragment extends LiveDialogFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiHELIOSAoIDt9GzUjPSM6Ly04ACIyLyAAIDwnGDcpPyY2PwElKCM8LwM+KCg+LSs4";
    public RecyclerView LL;
    public RelativeLayout LLILLJJLI;
    public C1840250xzL LLILLL;
    public C21513519Hh LLILZ;
    public C1002310cBp LLILZIL;
    public C0S2Y LLILZLL;
    public LiveIconView LLIZ;
    public C16FS LLIZLLLIL;
    public C125C LLJ;
    public C1840270xzN LLJI;
    public RelativeLayout LLJIJIL;
    public C207213166p LLJILLL;
    public Bitmap LLJJ;
    public Bitmap LLJJI;
    public Bitmap LLJJIII;
    public int LLJJIJIIJIL;
    public Rect LLJJJ;
    public List<Matrix> LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public DialogC780480UjW LLJL;
    public boolean LLJLIL;
    public final Matrix LLJLILLLLZIIL;
    public int LLJLL;
    public List<Bitmap> LLJILJIL = new ArrayList();
    public List<Bitmap> LLJILJILJ = new ArrayList();
    public String LLJJIJI = "";
    public AnonymousClass1673 LLJJIJIL = AnonymousClass1673.OTHER;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C21513519Hh OR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ld7) : null;
            this.LLILZ = (C21513519Hh) viewFindViewById;
        }
        return (C21513519Hh) viewFindViewById;
    }

    public final C1840250xzL PR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rp8) : null;
            this.LLILLL = (C1840250xzL) viewFindViewById;
        }
        return (C1840250xzL) viewFindViewById;
    }

    public final RecyclerView RR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wkc) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.djr);
        c500980Jkm.LIZJ = R.style.ahl;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    public SpotlightImageListPreviewDialogFragment() {
        new Rect(0, 0, 0, 0);
        this.LLJLILLLLZIIL = new Matrix();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        Map<String, Object> map;
        super.onDestroy();
        int i = AnonymousClass1670.LIZIZ[this.LLJJIJIL.ordinal()];
        if (i == 1) {
            str = "done";
        } else if (i == 2) {
            str = "delete";
        } else if (i != 3) {
            C207213166p c207213166p = this.LLJILLL;
            if (c207213166p != null) {
                C495190JbR c495190JbR = c207213166p.LJIIIIZZ;
            }
            str = "others";
        } else {
            C207213166p c207213166p2 = this.LLJILLL;
            if (c207213166p2 != null) {
                C495190JbR c495190JbR2 = c207213166p2.LJIIIIZZ;
            }
            str = "back";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_emote_edit_page_leave");
        c474500IjALIZ.LJJII(Long.valueOf(SystemClock.elapsedRealtime() - this.LLJJLIIIJLLLLLLLZ), "duration");
        c474500IjALIZ.LJJII(str, "leave_type");
        C207213166p c207213166p3 = this.LLJILLL;
        if (c207213166p3 != null && (map = c207213166p3.LJ) != null) {
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
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    public final Bitmap NR(Bitmap bitmap) {
        Bitmap.Config config;
        Bitmap bitmap2 = this.LLJJI;
        if (bitmap != null && (config = bitmap.getConfig()) != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, new Matrix(), null);
            return bitmapCreateBitmap;
        }
        return bitmap2;
    }

    public final void SR(C474500IjA c474500IjA) {
        c474500IjA.LJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
    }

    public final void UR(final Bitmap bitmap) {
        this.LLJJ = bitmap;
        this.LLJJI = bitmap;
        View viewFindViewById = this.LLJI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.wug);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (C1840270xzN) viewFindViewById;
        }
        C1840270xzN c1840270xzN = (C1840270xzN) viewFindViewById;
        if (c1840270xzN != null) {
            c1840270xzN.setIntercepter(new C1831820xlk() { // from class: X.166z
                @Override // X.InterfaceC1840280xzO
                public final void LJJJJ(MotionEvent motionEvent) {
                    Rect visibleRect;
                    this.LIZ.LLJLIL = true;
                    if (motionEvent != null) {
                        if (motionEvent.getAction() == 0) {
                            C1840250xzL c1840250xzLPR = this.LIZ.PR();
                            if (c1840250xzLPR != null) {
                                c1840250xzLPR.LIZIZ();
                                return;
                            }
                            return;
                        }
                        if (motionEvent.getAction() != 1) {
                            return;
                        }
                        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = this.LIZ;
                        if (spotlightImageListPreviewDialogFragment.LLJJJ == null) {
                            C1840250xzL c1840250xzLPR2 = spotlightImageListPreviewDialogFragment.PR();
                            if (c1840250xzLPR2 != null) {
                                visibleRect = c1840250xzLPR2.getVisibleRect();
                            } else {
                                visibleRect = null;
                            }
                            spotlightImageListPreviewDialogFragment.LLJJJ = visibleRect;
                        }
                        C1840250xzL c1840250xzLPR3 = this.LIZ.PR();
                        if (c1840250xzLPR3 != null) {
                            c1840250xzLPR3.LIZJ();
                        }
                        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment2 = this.LIZ;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscriptoon_highlight_drag_click");
                        spotlightImageListPreviewDialogFragment2.SR(c474500IjALIZ);
                        c474500IjALIZ.LJJII(spotlightImageListPreviewDialogFragment2.LLJJIJI, "show_entrance");
                        c474500IjALIZ.LIZ();
                        C21513519Hh c21513519HhOR = this.LIZ.OR();
                        if (c21513519HhOR == null) {
                            return;
                        }
                        HandlerHook.viewPostDelay(c21513519HhOR, new ARunnableS131S0100000_31(this.LIZ, 75), 310L);
                    }
                }
            });
        }
        C21513519Hh c21513519HhOR = OR();
        if (c21513519HhOR != null) {
            c21513519HhOR.setImageBitmap(this.LLJJ);
        }
        final float f = (this.LLJJL / 2.0f) - (this.LLJJJJ + (this.LLJJJJJIL / 2));
        final C817403Hg c817403Hg = new C817403Hg();
        if (bitmap != null && this.LLJJJJJIL > 0) {
            int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
            int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
            if (iMin > 0) {
                c817403Hg.element = (((iMax * this.LLJJJJJIL) / iMin) - this.LLJJJJLIIL) / 2.0f;
            }
        }
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        View view2 = this.LLJIJIL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.to8);
            }
            this.LLJIJIL = (RelativeLayout) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        RelativeLayout relativeLayout = (RelativeLayout) view2;
        if (relativeLayout != null) {
            C786410Ut5.S7(relativeLayout, new ACListenerS133S0200000_31(this, activity, 14));
        }
        C21513519Hh c21513519HhOR2 = OR();
        if (c21513519HhOR2 != null) {
            c21513519HhOR2.setFirstReadyListener(new C167P() { // from class: X.166y
                /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
                @Override // X.C167P
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 293
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C207222166y.LIZ():void");
                }
            });
        }
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

    public final Bitmap MR(C21513519Hh c21513519Hh, Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        RectF rectFLIZLLL = c21513519Hh.LIZLLL(null);
        if (this.LLJJJ == null) {
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

    /* JADX WARN: Removed duplicated region for block: B:115:0x02b1  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
