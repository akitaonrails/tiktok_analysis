package com.ss.android.ugc.aweme.ftc.pages;

import X.AbstractC21673619ry;
import X.C098200Yq;
import X.C0CHQ;
import X.C0TVI;
import X.C1388190mED;
import X.C1446620nkS;
import X.C1447190nlN;
import X.C1447520nlu;
import X.C1447610nm3;
import X.C1452730nuJ;
import X.C14K9;
import X.C1685300txQ;
import X.C1741940vQm;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1A6V;
import X.C426750GoL;
import X.C497820Jfg;
import X.C786410Ut5;
import X.InterfaceC1447180nlM;
import X.InterfaceC1447490nlr;
import X.InterfaceC1447550nlx;
import X.InterfaceC1447630nm5;
import X.InterfaceC1452170ntP;
import Y.ARunnableS22S0100100_22;
import Y.ARunnableS91S0200000_22;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.MvEffectVideoCoverGeneratorImpl;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import irm.AkS60S0200000_22;
import irm.AkS90S0100000_22;
import kotlin.Unit;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class FTCChooseCoverFragment extends Fragment implements InterfaceC1447550nlx {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM4KmHELIOSEjKSIpOmEVHAYPISA8OyAPJjk2OgM+KCg+LSs4";
    public TuxTextView LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public FrameLayout LLILZ;
    public FrameLayout LLILZIL;
    public RelativeLayout LLILZLL;
    public C1447520nlu LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public FrameLayout LLJI;
    public LinearLayout LLJIJIL;
    public InterfaceC1447490nlr LLJILJIL;
    public float LLJILJILJ;
    public boolean LLJILLL;
    public MutableLiveData<Bitmap> LLJJ;
    public MutableLiveData<Boolean> LLJJI;
    public SafeHandler LLJJIII;
    public boolean LLJJIJI;
    public InterfaceC1447630nm5 LLJJIJIIJIL;
    public AbstractC21673619ry<RecyclerView.ViewHolder> LLJJIJIL;

    @Override // X.InterfaceC1447550nlx
    public final void LJLJI() {
        SafeHandler safeHandler = this.LLJJIII;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.removeCallbacksAndMessages(null);
        C1452730nuJ c1452730nuJLIZJ = C1452730nuJ.LIZJ();
        InterfaceC1447490nlr interfaceC1447490nlr = this.LLJILJIL;
        (interfaceC1447490nlr != null ? interfaceC1447490nlr : null).LLIIII().setValue(c1452730nuJLIZJ);
    }

    public final void MR() {
        SafeHandler safeHandler = this.LLJJIII;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.removeCallbacksAndMessages(null);
        C1452730nuJ c1452730nuJLIZJ = C1452730nuJ.LIZJ();
        InterfaceC1447490nlr interfaceC1447490nlr = this.LLJILJIL;
        if (interfaceC1447490nlr == null) {
            interfaceC1447490nlr = null;
        }
        interfaceC1447490nlr.LLIIII().setValue(c1452730nuJLIZJ);
        InterfaceC1447490nlr interfaceC1447490nlr2 = this.LLJILJIL;
        if (interfaceC1447490nlr2 == null) {
            interfaceC1447490nlr2 = null;
        }
        interfaceC1447490nlr2.LLFII().setLoopPlay(true);
        C1452730nuJ c1452730nuJLIZ = C1452730nuJ.LIZ();
        InterfaceC1447490nlr interfaceC1447490nlr3 = this.LLJILJIL;
        (interfaceC1447490nlr3 != null ? interfaceC1447490nlr3 : null).LLIIII().setValue(c1452730nuJLIZ);
        if (getFragmentManager() == null || !isAdded()) {
            return;
        }
        C19EH c19ehLJIIJ = requireFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIIZILJ(this);
        c19ehLJIIJ.LJIIJ();
    }

    public final FrameLayout NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gva) : null;
            this.LLILZ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ji_) : null;
            this.LLILZIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1447520nlu PR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.videoCoverView) : null;
            this.LLIZ = (C1447520nlu) viewFindViewById;
        }
        return (C1447520nlu) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry = this.LLJJIJIL;
        if (abstractC21673619ry instanceof C1447610nm3) {
            ((C1447610nm3) abstractC21673619ry).LLILZIL.dispose();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
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

    @Override // X.InterfaceC1447550nlx
    public final void LJJJJJ(float f) {
        this.LLJJIJI = true;
        InterfaceC1447490nlr interfaceC1447490nlr = this.LLJILJIL;
        InterfaceC1447490nlr interfaceC1447490nlr2 = null;
        if (interfaceC1447490nlr == null) {
            interfaceC1447490nlr = null;
        }
        C1452730nuJ c1452730nuJLIZIZ = C1452730nuJ.LIZIZ((int) (interfaceC1447490nlr.LLFII().getDuration() * f));
        InterfaceC1447490nlr interfaceC1447490nlr3 = this.LLJILJIL;
        if (interfaceC1447490nlr3 != null) {
            interfaceC1447490nlr2 = interfaceC1447490nlr3;
        }
        interfaceC1447490nlr2.LLIIII().setValue(c1452730nuJLIZIZ);
    }

    @Override // X.InterfaceC1447550nlx
    public final void LLL(float f) {
        RR(f);
    }

    public final void RR(float f) {
        this.LLJJIJI = true;
        InterfaceC1447490nlr interfaceC1447490nlr = this.LLJILJIL;
        InterfaceC1447490nlr interfaceC1447490nlr2 = null;
        if (interfaceC1447490nlr == null) {
            interfaceC1447490nlr = null;
        }
        C1452730nuJ c1452730nuJLIZLLL = C1452730nuJ.LIZLLL((int) (interfaceC1447490nlr.LLFII().getDuration() * f));
        InterfaceC1447490nlr interfaceC1447490nlr3 = this.LLJILJIL;
        if (interfaceC1447490nlr3 != null) {
            interfaceC1447490nlr2 = interfaceC1447490nlr3;
        }
        interfaceC1447490nlr2.LLIIII().setValue(c1452730nuJLIZLLL);
        SR(c1452730nuJLIZLLL.LIZIZ);
    }

    public final void SR(long j) {
        C1452730nuJ c1452730nuJLIZJ = C1452730nuJ.LIZJ();
        InterfaceC1447490nlr interfaceC1447490nlr = this.LLJILJIL;
        SafeHandler safeHandler = null;
        if (interfaceC1447490nlr == null) {
            interfaceC1447490nlr = null;
        }
        interfaceC1447490nlr.LLIIII().setValue(c1452730nuJLIZJ);
        C1452730nuJ c1452730nuJLIZ = C1452730nuJ.LIZ();
        InterfaceC1447490nlr interfaceC1447490nlr2 = this.LLJILJIL;
        if (interfaceC1447490nlr2 == null) {
            interfaceC1447490nlr2 = null;
        }
        interfaceC1447490nlr2.LLIIII().setValue(c1452730nuJLIZ);
        SafeHandler safeHandler2 = this.LLJJIII;
        if (safeHandler2 != null) {
            safeHandler = safeHandler2;
        }
        safeHandler.postDelayed(new ARunnableS22S0100100_22(this, j, 0), 1000L);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        InterfaceC1447630nm5 mvEffectVideoCoverGeneratorImpl;
        FTCChooseCoverFragment fTCChooseCoverFragment = this;
        super.onActivityCreated(bundle);
        fTCChooseCoverFragment.LLJJIII = new SafeHandler(fTCChooseCoverFragment);
        InterfaceC1447490nlr interfaceC1447490nlr = fTCChooseCoverFragment.LLJILJIL;
        View viewFindViewById = null;
        if (interfaceC1447490nlr == null) {
            interfaceC1447490nlr = null;
        }
        VideoPublishEditModel videoPublishEditModelLJI = interfaceC1447490nlr.LJI();
        if (C1446620nkS.LIZ()) {
            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
        } else {
            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
        }
        InterfaceC1447490nlr interfaceC1447490nlr2 = fTCChooseCoverFragment.LLJILJIL;
        if (interfaceC1447490nlr2 == null) {
            interfaceC1447490nlr2 = null;
        }
        VideoPublishEditModel videoPublishEditModelLJI2 = interfaceC1447490nlr2.LJI();
        if (!fTCChooseCoverFragment.LLJILLL && !videoPublishEditModelLJI2.isMvThemeVideoType()) {
            if (videoPublishEditModelLJI.isMultiVideoEdit()) {
                InterfaceC1447490nlr interfaceC1447490nlr3 = fTCChooseCoverFragment.LLJILJIL;
                if (interfaceC1447490nlr3 == null) {
                    interfaceC1447490nlr3 = null;
                }
                int duration = interfaceC1447490nlr3.LLFII().getDuration();
                InterfaceC1447490nlr interfaceC1447490nlr4 = fTCChooseCoverFragment.LLJILJIL;
                if (interfaceC1447490nlr4 == null) {
                    interfaceC1447490nlr4 = null;
                }
                mvEffectVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(interfaceC1447490nlr4.LLFII(), fTCChooseCoverFragment, fTCChooseCoverFragment.PR().getCoverSize(), duration, 0, get_frames_flags);
            } else {
                InterfaceC1447490nlr interfaceC1447490nlr5 = fTCChooseCoverFragment.LLJILJIL;
                if (interfaceC1447490nlr5 == null) {
                    interfaceC1447490nlr5 = null;
                }
                InterfaceC1452170ntP interfaceC1452170ntPLLFII = interfaceC1447490nlr5.LLFII();
                int coverSize = fTCChooseCoverFragment.PR().getCoverSize();
                fTCChooseCoverFragment = fTCChooseCoverFragment;
                mvEffectVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(interfaceC1452170ntPLLFII, fTCChooseCoverFragment, coverSize, get_frames_flags, "choose_cover");
            }
        } else {
            InterfaceC1447490nlr interfaceC1447490nlr6 = fTCChooseCoverFragment.LLJILJIL;
            if (interfaceC1447490nlr6 == null) {
                interfaceC1447490nlr6 = null;
            }
            interfaceC1447490nlr6.LLFII().getDuration();
            mvEffectVideoCoverGeneratorImpl = new MvEffectVideoCoverGeneratorImpl();
        }
        fTCChooseCoverFragment.LLJJIJIIJIL = mvEffectVideoCoverGeneratorImpl;
        fTCChooseCoverFragment.PR().setOnScrollListener(fTCChooseCoverFragment);
        HandlerHook.viewPost(fTCChooseCoverFragment.PR(), new ARunnableS91S0200000_22(fTCChooseCoverFragment, videoPublishEditModelLJI, 3));
        View viewFindViewById2 = fTCChooseCoverFragment.LLIZLLLIL;
        if (viewFindViewById2 == null) {
            View view = fTCChooseCoverFragment.getView();
            if (view != null) {
                viewFindViewById2 = view.findViewById(R.id.z2y);
            } else {
                viewFindViewById2 = null;
            }
            fTCChooseCoverFragment.LLIZLLLIL = (TuxTextView) viewFindViewById2;
        }
        C786410Ut5.h9((TuxTextView) viewFindViewById2, new AkS90S0100000_22(fTCChooseCoverFragment, 1));
        View view2 = fTCChooseCoverFragment.LLJ;
        if (view2 == null) {
            View view3 = fTCChooseCoverFragment.getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.z2x);
            }
            fTCChooseCoverFragment.LLJ = (TuxTextView) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.h9((TuxTextView) view2, new AkS60S0200000_22(videoPublishEditModelLJI, fTCChooseCoverFragment, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC1447490nlr) {
            this.LLJILJIL = (InterfaceC1447490nlr) context;
            SettingsManager.LIZLLL().getClass();
            this.LLJILLL = SettingsManager.LIZ("is_low_memory_machine_for_tools", false);
            C1741940vQm.LIZJ(C1388190mED.LIZ(context));
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EffectTextModel effectTextModel;
        Window window;
        super.onViewCreated(view, bundle);
        int iLIZJ = 0;
        if (Build.VERSION.SDK_INT >= 35 && !view.getFitsSystemWindows()) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0DLk
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, view2.getPaddingTop(), c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        C19EG activity = getActivity();
        View viewFindViewById = null;
        if (activity instanceof C19GS) {
            C19EG activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                new C1A6V(window, window.getDecorView()).LIZJ(true);
            }
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.z36);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (TuxTextView) viewFindViewById2;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById2, 8);
            View viewFindViewById3 = this.LLILLL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.gv9);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLL = (FrameLayout) viewFindViewById3;
            }
            int paddingTop = viewFindViewById3.getPaddingTop();
            C19EG activity3 = getActivity();
            if (activity3 != null) {
                iLIZJ = C497820Jfg.LIZJ(activity3);
            }
            C426750GoL.LJIIL(viewFindViewById3, null, Integer.valueOf(paddingTop + iLIZJ), null, null, 29);
            InterfaceC1447180nlM interfaceC1447180nlMLIZ = C0CHQ.LIZ().LIZ();
            C19GS c19gs = (C19GS) activity;
            View viewFindViewById4 = this.LLILLJJLI;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.gv_);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILLJJLI = (FrameLayout) viewFindViewById4;
            }
            FrameLayout frameLayout = (FrameLayout) viewFindViewById4;
            View viewFindViewById5 = this.LLILLL;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.gv9);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILLL = (FrameLayout) viewFindViewById5;
            }
            C1447190nlN c1447190nlN = new C1447190nlN(frameLayout, (FrameLayout) viewFindViewById5, NR());
            InterfaceC1447490nlr interfaceC1447490nlr = this.LLJILJIL;
            if (interfaceC1447490nlr == null) {
                interfaceC1447490nlr = null;
            }
            CoverPublishModel coverPublishModel = interfaceC1447490nlr.LJI().getCoverPublishModel();
            if (coverPublishModel != null) {
                effectTextModel = coverPublishModel.getEffectTextModel();
            } else {
                effectTextModel = null;
            }
            c1447190nlN.LIZLLL = effectTextModel;
            InterfaceC1447490nlr interfaceC1447490nlr2 = this.LLJILJIL;
            if (interfaceC1447490nlr2 == null) {
                interfaceC1447490nlr2 = null;
            }
            c1447190nlN.LJ = interfaceC1447490nlr2.LJI().creativeModel.publishCustomCoverModel;
            InterfaceC1447490nlr interfaceC1447490nlr3 = this.LLJILJIL;
            if (interfaceC1447490nlr3 == null) {
                interfaceC1447490nlr3 = null;
            }
            c1447190nlN.LJFF = interfaceC1447490nlr3.LJI().getAvetParameter();
            c1447190nlN.LJI = new AwS601S0100000_22(this, 96);
            interfaceC1447180nlMLIZ.LJ(c19gs, c1447190nlN);
        } else {
            View viewFindViewById6 = this.LL;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.z36);
                } else {
                    viewFindViewById6 = null;
                }
                this.LL = (TuxTextView) viewFindViewById6;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById6, 0);
        }
        View view7 = this.LLILZLL;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById = view8.findViewById(R.id.viewRoot);
            }
            this.LLILZLL = (RelativeLayout) viewFindViewById;
            view7 = viewFindViewById;
        }
        view7.setOnTouchListener(new View.OnTouchListener() { // from class: X.0nlw
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view9, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8m, viewGroup, false);
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
