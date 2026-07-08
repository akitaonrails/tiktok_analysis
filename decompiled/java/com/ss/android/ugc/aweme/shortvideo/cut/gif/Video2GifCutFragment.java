package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import X.C098200Yq;
import X.C0CHQ;
import X.C0WIY;
import X.C12UW;
import X.C1390380mHk;
import X.C1685300txQ;
import X.C1848410yCV;
import X.C189200o6;
import X.C19764212Um;
import X.C19EG;
import X.C19GS;
import X.C1C7U;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2354709Kn;
import X.C366700EZg;
import X.C786410Ut5;
import X.InterfaceC19764112Ul;
import X.ViewTreeObserverOnGlobalLayoutListenerC1402100mae;
import Y.ACListenerS163S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.graphics.Outline;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import mf.a;
import pyl.s;

/* JADX INFO: loaded from: classes30.dex */
public class Video2GifCutFragment extends Fragment {
    public static final double LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoHELIOSLCB9KzA4Zyg6LmsaICs2J3cLICkQPTEKOy40JSAiPQ==";
    public TextureView LL;
    public ImageView LLILLJJLI;
    public FrameLayout LLILLL;
    public C12UW LLILZ;
    public TextView LLILZIL;
    public boolean LLILZLL;
    public MediaPlayerModule LLIZ;
    public CutMultiVideoViewModel LLIZLLLIL;
    public VideoEditViewModel LLJ;
    public VideoShare2GifEditContext LLJI;
    public final AObserverS231S0100000_29 LLJIJIL = new AObserverS231S0100000_29(this, 181);
    public final Handler LLJILJIL = new BPEAHandler(Looper.getMainLooper()) { // from class: com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int iIntValue;
            C1C7U.LIZ("Video2GifCutFragment@f89a.<field>$1");
            super.handleMessage(message);
            if (message.what == 0) {
                CutMultiVideoViewModel cutMultiVideoViewModel = Video2GifCutFragment.this.LLIZLLLIL;
                long jLongValue = ((Long) HandlerHook.getMessageObj(message.obj)).longValue();
                List<VideoSegment> listDQ2 = Video2GifCutFragment.this.LLJ.DQ2();
                cutMultiVideoViewModel.LLILLL.setValue(Long.valueOf(jLongValue));
                int i = 0;
                if (cutMultiVideoViewModel.LL.getValue() != null) {
                    iIntValue = cutMultiVideoViewModel.LL.getValue().LIZIZ.intValue();
                } else {
                    iIntValue = 0;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < listDQ2.size(); i2++) {
                    if (!((VideoSegment) ListProtector.get(listDQ2, i2)).isDeleted) {
                        arrayList.add(ListProtector.get(listDQ2, i2));
                    }
                }
                int i3 = 0;
                long j = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    j += ((VideoSegment) ListProtector.get(arrayList, i3)).duration;
                    if (j > jLongValue) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                if (jLongValue > 0) {
                    cutMultiVideoViewModel.LL.setValue(new C0WIY<>(Integer.valueOf(iIntValue), Integer.valueOf(i)));
                }
            }
            C1C7U.LIZIZ("Video2GifCutFragment@f89a.<field>$1");
        }
    };
    public final ARunnableS129S0100000_29 LLJILJILJ = new ARunnableS129S0100000_29(this, 61);

    public final void NR() {
        C0WIY<Long, Long> singleVideoPlayBoundary;
        Long l;
        this.LLILZIL.setText(getString(2131837618, this.LLILZ != null ? C786410Ut5.k4(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.LLILZ.getSelectedTime())}) : ""));
        C12UW c12uw = this.LLILZ;
        if (c12uw == null || (singleVideoPlayBoundary = c12uw.getSingleVideoPlayBoundary()) == null || (l = singleVideoPlayBoundary.LIZ) == null || singleVideoPlayBoundary.LIZIZ == null) {
            return;
        }
        this.LLJI.inPoint = l.longValue();
        this.LLJI.outPoint = singleVideoPlayBoundary.LIZIZ.longValue();
    }

    static {
        C0CHQ.LIZ().LJJIZ();
        LLJILLL = s.FAST.value();
    }

    public final void MR() {
        if (getActivity() != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131840513);
            C1390380mHk.LJ(this, 1016, creativeToastBuilder);
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            MR();
            return;
        }
        this.LLIZLLLIL = (CutMultiVideoViewModel) ViewModelProviders.of(getActivity()).get(CutMultiVideoViewModel.class);
        this.LLJ = (VideoEditViewModel) ViewModelProviders.of(getActivity()).get(VideoEditViewModel.class);
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getArguments().getParcelable("extra_edit_context");
        this.LLJI = videoShare2GifEditContext;
        if (videoShare2GifEditContext != null) {
            return;
        }
        MR();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0ntS] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(202114);
        super.onViewCreated(view, bundle);
        this.LL = (TextureView) view.findViewById(R.id.xrx);
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.qmu);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.ibc);
        this.LLILZ = (C12UW) view.findViewById(R.id.video_edit_view);
        this.LLILZIL = (TextView) view.findViewById(R.id.tv_time);
        TextureView textureView = this.LL;
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 242);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(textureView);
        }
        textureView.setOnClickListener(aVar);
        this.LL.setClipToOutline(true);
        TextureView textureView2 = this.LL;
        final int iLIZ = C366700EZg.LIZ(10);
        textureView2.setOutlineProvider(new ViewOutlineProvider(iLIZ) { // from class: X.0GZw
            public final int LIZ;

            {
                this.LIZ = iLIZ;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), this.LIZ);
            }
        });
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.x3(frameLayout.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1402100mae(this, 9));
        }
        this.LLILZ.setMinVideoLength(2000L);
        this.LLILZ.setMaxVideoLength(15000L);
        if (!this.LLILZ.LIZJ(getActivity(), ViewModelProviders.of(getActivity()), this.LLIZLLLIL, this.LLJI.videoPath) && getActivity() != null) {
            getActivity().finish();
        } else {
            VideoEditViewModel videoEditViewModel = this.LLJ;
            if (videoEditViewModel != null) {
                videoEditViewModel.LLILLL.observe(this, new AObserverS231S0100000_29(this, 182));
                this.LLJ.LLILZIL.observe(this, new AObserverS231S0100000_29(this, 183));
                this.LLJ.LLILZ.observe(this, new AObserverS231S0100000_29(this, 184));
                this.LLJ.LLILZLL.observe(this, new AObserverS231S0100000_29(this, 185));
                this.LLJ.LLIZ.observe(this, new AObserverS231S0100000_29(this, 186));
                this.LLJ.LLJILJILJ.observe(this, new AObserverS231S0100000_29(this, 187));
            }
            try {
                final String strLJJIL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIL();
                C2354709Kn.LJIJJ(strLJJIL);
                final TextureView textureView3 = this.LL;
                ?? r5 = new InterfaceC19764112Ul(strLJJIL, textureView3) { // from class: X.0ntS
                    public final C1463670oBx LIZ;
                    public long LIZIZ;
                    public long LIZJ;
                    public double LIZLLL = 1.0d;

                    @Override // X.InterfaceC19764112Ul
                    public final long getCurrentPosition() {
                        return (long) (((double) this.LIZ.LLL()) * this.LIZLLL);
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final long getDuration() {
                        return (long) (((double) this.LIZ.getDuration()) * this.LIZLLL);
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void pause() {
                        this.LIZ.pause();
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void release() {
                        this.LIZ.destroy();
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void resume() {
                        this.LIZ.play();
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void start() {
                        this.LIZ.play();
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void stop() {
                        this.LIZ.pause();
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void LIZ(double d) {
                        C352130DrH.LIZIZ(this.LIZ).LJFF().LJIL(new C347060Dj6((float) d));
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void LIZIZ(long j) {
                        this.LIZ.nf((int) (j / this.LIZLLL), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void LIZJ(String str) {
                        C571670MbV.LIZ(new C1DOU(new String[]{str}), C352130DrH.LIZIZ(this.LIZ).LIZ);
                        this.LIZ.prepare();
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void LJ(double d) {
                        this.LIZLLL = d;
                        this.LIZ.LJII((float) d);
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void LJFF(long j) {
                        LIZLLL(this.LIZIZ, j);
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void LJI(long j) {
                        LIZLLL(j, this.LIZJ);
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void setLoop(boolean z) {
                        this.LIZ.setLoopPlay(z);
                    }

                    {
                        this.LIZ = new C1463670oBx(strLJJIL, textureView3, EnumC1464030oCX.DEFAULT, EnumC1442010nd1.UPLOAD_OTHER);
                    }

                    @Override // X.InterfaceC19764112Ul
                    public final void LIZLLL(long j, long j2) {
                        boolean z;
                        if (this.LIZ.getState() == VEEditor.VEState.STARTED) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.LIZIZ = j;
                        this.LIZJ = j2;
                        this.LIZ.uf(((int) j) / 2, ((int) j2) / 2);
                        LIZIZ(j);
                        if (z) {
                            resume();
                        }
                    }
                };
                C19764212Um c19764212Um = new C19764212Um();
                c19764212Um.LIZJ = true;
                c19764212Um.LIZ = (float) LLJILLL;
                c19764212Um.LIZIZ = 0.0f;
                c19764212Um.LIZLLL = this.LLILZ.getMaxCutDuration();
                MediaPlayerModule mediaPlayerModule = new MediaPlayerModule(r5, c19764212Um);
                this.LLIZ = mediaPlayerModule;
                mediaPlayerModule.LL = this.LLJI.videoPath;
                mediaPlayerModule.LLIZLLLIL.observe(this, this.LLJIJIL);
                MediaPlayerModule mediaPlayerModule2 = this.LLIZ;
                TextureView textureView4 = this.LL;
                mediaPlayerModule2.getClass();
                mediaPlayerModule2.LLIZ = textureView4.getSurfaceTextureListener();
                textureView4.setSurfaceTextureListener(mediaPlayerModule2);
                getLifecycle().addObserver(this.LLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                MR();
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9z, viewGroup, false);
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
