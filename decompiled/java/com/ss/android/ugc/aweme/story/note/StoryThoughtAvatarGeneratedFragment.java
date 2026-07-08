package com.ss.android.ugc.aweme.story.note;

import X.C01GW;
import X.C098200Yq;
import X.C0HIW;
import X.C0HIX;
import X.C0HU6;
import X.C0HUY;
import X.C1295960jpS;
import X.C1342130l1v;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19745112Nd;
import X.C19746312Np;
import X.C19746412Nq;
import X.C19EG;
import X.C19GS;
import X.C21647019ng;
import X.C298600Bn8;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC19746112Nn;
import X.EnumC438630HHx;
import Y.AObserverS189S0200000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class StoryThoughtAvatarGeneratedFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjPSp9HELIOSGzEjOzYHICo5LicnCTMtPS4hDyAiLD0yPCAoDz0yLygpJzs=";
    public C19745112Nd LLIZLLLIL;
    public BPEAHandler LLJ;
    public ARunnableS129S0100000_29 LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public MediaPlayer LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 487));
    public final C0HU6 LLJJ = new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MediaPlayer mediaPlayer = this.LLJILJILJ;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
        }
        this.LLJILJILJ = null;
        this.LLJILLL = false;
        this.LLIZLLLIL = null;
    }

    public final void VR(int i) {
        TuxTextView tuxTextView;
        C19745112Nd c19745112Nd = this.LLIZLLLIL;
        if (c19745112Nd != null && (tuxTextView = c19745112Nd.LLILLL) != null) {
            if (i == 0) {
                tuxTextView.setText(tuxTextView.getContext().getString(2131850174));
                tuxTextView.LJJJJI(17.0f);
            } else {
                tuxTextView.setText(tuxTextView.getContext().getString(2131850175, String.valueOf(i)));
                tuxTextView.LJJJJI(20.0f);
            }
        }
    }

    public static List UR(Pair pair, Pair pair2) {
        return C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue())), new C19746412Nq("scaleX", new C0HIW(((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue())), new C19746412Nq("scaleY", new C0HIX(((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue())));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19745112Nd c19745112Nd = this.LLIZLLLIL;
        if (c19745112Nd == null) {
            return;
        }
        ((StoryThoughtAvatarCreationVM) this.LLIZ.getValue()).LLLILZ.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(c19745112Nd, this, 91));
        ((StoryThoughtAvatarCreationVM) this.LLIZ.getValue()).LLLLIIIILLL.observe(getViewLifecycleOwner(), new AObserverS189S0200000_29(c19745112Nd, this, 0));
        if (C298600Bn8.LIZ()) {
            final MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(4).build());
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.12Nk
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.LL.LLJILLL = true;
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.12Nl
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    this.LL.LLJILLL = false;
                    return false;
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.12Nj
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    try {
                        mediaPlayer.seekTo(0);
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
            try {
                mediaPlayer.setDataSource(EnumC438630HHx.GENERATION_COMPLETE_SOUND_EFFECT.getBackupUrl());
                mediaPlayer.prepareAsync();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLJILLL = false;
            } catch (IllegalStateException e2) {
                TryCatchGuardChecker.doCheck(e2);
                this.LLJILLL = false;
            }
            this.LLJILJILJ = mediaPlayer;
            this.LLJ = new BPEAHandler(Looper.getMainLooper());
            ((StoryThoughtAvatarCreationVM) this.LLIZ.getValue()).LLLLLILLIL.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(this, 92));
        }
    }

    public final C21647019ng SR(Context context, View view, List<C19746412Nq> list) {
        return new C21647019ng(context, view, new C19746312Np(EnumC19746112Nn.SPRING, this.LLJJ, list), false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fe7, viewGroup, false);
        int i = R.id.bh2;
        SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.bh2, viewTd);
        if (smartImageView != null) {
            i = R.id.f12;
            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.f12, viewTd);
            if (tuxTextView != null) {
                i = R.id.isx;
                C1295960jpS c1295960jpS = (C1295960jpS) C1616006Uk.LIZ(R.id.isx, viewTd);
                if (c1295960jpS != null) {
                    FrameLayout frameLayout = (FrameLayout) viewTd;
                    this.LLIZLLLIL = new C19745112Nd(frameLayout, smartImageView, tuxTextView, c1295960jpS);
                    C19GS c19gs = null;
                    if (!(frameLayout instanceof View)) {
                        frameLayout = null;
                    }
                    if (frameLayout != null) {
                        try {
                            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                            ViewTreeViewModelStoreOwner.set(frameLayout, this);
                            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                            C19EG activity = getActivity();
                            if (activity instanceof C19GS) {
                                c19gs = (C19GS) activity;
                            }
                            C1685300txQ.LIZ(c19gs);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                            return frameLayout;
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return frameLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
