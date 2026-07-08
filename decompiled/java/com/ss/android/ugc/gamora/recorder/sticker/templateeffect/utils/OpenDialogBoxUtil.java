package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils;

import X.C098200Yq;
import X.C0C64;
import X.C0HTI;
import X.C0N64;
import X.C0NFK;
import X.C0PEM;
import X.C1389600mGU;
import X.C1483410ohn;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.InterfaceC588400N5y;
import Y.ACListenerS144S0100000_9;
import Y.ATListenerS443S0100000_9;
import android.app.Dialog;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class OpenDialogBoxUtil extends GlobalHookDialogFragment implements InterfaceC588400N5y {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWs+LCw8OiEpO2EgPCwvIiHELIOSohZjEpJD8/KTEpLCk1LSY4ZzonISk/ZwAjLSsIIC4/JyIOJjcGPCwg";
    public C0N64 LL;
    public TextureView LLILLJJLI;
    public SmartImageView LLILLL;
    public RelativeLayout LLILZ;
    public RelativeLayout LLILZIL;
    public C197039127h LLILZLL;
    public TuxTextView LLIZ;
    public ProgressBar LLIZLLLIL;
    public OnboardingButtonClickListener LLJ;

    @Override // X.InterfaceC588400N5y
    public final void ZI() {
        ProgressBar progressBar = this.LLIZLLLIL;
        if (progressBar == null) {
            progressBar = null;
        }
        C786410Ut5.LLIIJLIL(progressBar, 8);
        SmartImageView smartImageView = this.LLILLL;
        C786410Ut5.LLFF(0, smartImageView != null ? smartImageView : null);
    }

    @Override // X.InterfaceC588400N5y
    public final void r6() {
        ProgressBar progressBar = this.LLIZLLLIL;
        if (progressBar == null) {
            progressBar = null;
        }
        C786410Ut5.LLIIJLIL(progressBar, 8);
        SmartImageView smartImageView = this.LLILLL;
        C786410Ut5.LLFF(8, smartImageView != null ? smartImageView : null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        C0N64 c0n64 = this.LL;
        if (c0n64 == null) {
            c0n64 = null;
        }
        c0n64.LIZJ = false;
        Surface surface = c0n64.LJ;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = c0n64.LIZLLL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        c0n64.LIZLLL = null;
        c0n64.LJ = null;
        c0n64.LIZ().clear();
        c0n64.LIZ.setSurfaceTextureListener(null);
        C1483410ohn c1483410ohn = c0n64.LJII;
        if (c1483410ohn != null) {
            c1483410ohn.LJJL();
            c1483410ohn.LJJIJ(null);
            c1483410ohn.LJJIIJZLJL();
            c1483410ohn.release();
        }
        c0n64.LJII = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NFK(this, null), 3);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OnboardingButtonClickListener onboardingButtonClickListener;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            onboardingButtonClickListener = (OnboardingButtonClickListener) arguments.getParcelable("LISTENER");
        } else {
            onboardingButtonClickListener = null;
        }
        this.LLJ = onboardingButtonClickListener;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLILLJJLI = (TextureView) view.findViewById(R.id.video_view);
        this.LLILLL = (SmartImageView) view.findViewById(R.id.fiv);
        this.LLILZ = (RelativeLayout) view.findViewById(R.id.mh5);
        this.LLILZIL = (RelativeLayout) view.findViewById(R.id.nx4);
        this.LLILZLL = (C197039127h) view.findViewById(R.id.pno);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.pkw);
        this.LLIZLLLIL = (ProgressBar) view.findViewById(R.id.q65);
        SmartImageView smartImageView = this.LLILLL;
        C197039127h c197039127h = null;
        if (smartImageView == null) {
            smartImageView = null;
        }
        C786410Ut5.LLFF(4, smartImageView);
        if (getContext() != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.oh;
            Drawable drawableLIZ = c0hti.LIZ(new ContextThemeWrapper(getContext(), R.style.y0));
            SmartImageView smartImageView2 = this.LLILLL;
            if (smartImageView2 == null) {
                smartImageView2 = null;
            }
            smartImageView2.setImageDrawable(drawableLIZ);
            SmartImageView smartImageView3 = this.LLILLL;
            if (smartImageView3 == null) {
                smartImageView3 = null;
            }
            smartImageView3.setActualImageScaleType(EnumC1338240kve.CENTER_INSIDE);
        }
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "create_tab_onboarding_video_url", "", true);
        Video video = new Video();
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append('_');
        sbLIZ.append(strLJJ);
        videoUrlModel.setSourceId(C2188811AlT.LIZIZ(sbLIZ));
        videoUrlModel.setUrlList(new ArrayList());
        videoUrlModel.getUrlList().add(strLJJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(getTag());
        sbLIZ2.append('_');
        sbLIZ2.append(strLJJ);
        videoUrlModel.setUrlKey(C2188811AlT.LIZIZ(sbLIZ2));
        video.setPlayAddr(videoUrlModel);
        video.setVideoLength(video.getVideoLength());
        TextureView textureView = this.LLILLJJLI;
        if (textureView == null) {
            textureView = null;
        }
        C0N64 c0n64 = new C0N64(textureView, this);
        this.LL = c0n64;
        c0n64.LJI = video;
        c0n64.LIZIZ();
        TextureView textureView2 = this.LLILLJJLI;
        if (textureView2 == null) {
            textureView2 = null;
        }
        textureView2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Out
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        SmartImageView smartImageView4 = this.LLILLL;
        if (smartImageView4 == null) {
            smartImageView4 = null;
        }
        smartImageView4.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Ouu
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Ouv
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        RelativeLayout relativeLayout = this.LLILZ;
        if (relativeLayout == null) {
            relativeLayout = null;
        }
        relativeLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Ouw
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        RelativeLayout relativeLayout2 = this.LLILZIL;
        if (relativeLayout2 == null) {
            relativeLayout2 = null;
        }
        relativeLayout2.setOnTouchListener(new ATListenerS443S0100000_9(this, 4));
        C197039127h c197039127h2 = this.LLILZLL;
        if (c197039127h2 != null) {
            c197039127h = c197039127h2;
        }
        C786410Ut5.U8(c197039127h, new ACListenerS144S0100000_9(this, 94));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setDimAmount(0.5f);
            window.addFlags(2);
            window.setFlags(67108864, 67108864);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i8n, viewGroup, false);
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
